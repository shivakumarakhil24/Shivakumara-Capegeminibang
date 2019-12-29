package com.ustglobal.stockmanagementsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.stockmanagementsystem.dto.Order_info;
import com.ustglobal.stockmanagementsystem.dto.Products_Info;

@Repository
public class ProductDAOImpl implements ProductDAO {
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public Products_Info getProductByName(String name) {
		EntityManager manager = factory.createEntityManager();
		try {
			String jpql = "from Products_Info where name=:name";
			TypedQuery<Products_Info> typedQuery = manager.createQuery(jpql, Products_Info.class);
			typedQuery.setParameter("name", name);
			Products_Info product = typedQuery.getSingleResult();
			return product;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<Products_Info> getProductByCategory(String category) {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from Products_Info where category=:category";
		TypedQuery<Products_Info> typedQuery = manager.createQuery(jpql, Products_Info.class);
		typedQuery.setParameter("category", category);
		return typedQuery.getResultList();
	}

	@Override
	public List<Products_Info> getProductByCompany(String company) {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from Products_Info where company=:company";
		TypedQuery<Products_Info> typedQuery = manager.createQuery(jpql, Products_Info.class);
		typedQuery.setParameter("company", company);
		return typedQuery.getResultList();
	}

	@Override
	public boolean addProduct(Products_Info product) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(product);
			transaction.commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean updateProduct(Products_Info product) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Products_Info p = manager.find(Products_Info.class, product.getId());
			p.setName(product.getName());
			p.setCategory(product.getCategory());
			p.setCompany(product.getCompany());
			p.setQuantity(product.getQuantity());
			p.setPrice(product.getPrice());
			transaction.commit();
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	@Override
	public boolean deleteProductById(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Products_Info p = manager.find(Products_Info.class, id);
			manager.remove(p);
			transaction.commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public List<Products_Info> showAllProducts() {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from Products_Info";
		TypedQuery<Products_Info> typedQuery = manager.createQuery(jpql, Products_Info.class);
		return typedQuery.getResultList();
	}

	@Override
	public boolean generateBill(List<Products_Info> beans, double total_price, double total_price_with_gst) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			for (Products_Info info : beans) {
				Products_Info bean = manager.find(Products_Info.class, info.getId());
				int quantity = bean.getQuantity();
				bean.setQuantity(quantity - 1);
			}
			Order_info oBean = new Order_info();
			oBean.setProduct(beans);
			oBean.setTotal_price(total_price);
			oBean.setTotal_price_with_gst(total_price_with_gst);
			manager.persist(oBean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
