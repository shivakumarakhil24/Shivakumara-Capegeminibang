package com.ustglobal.stockmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.stockmanagementsystem.dao.ProductDAO;
import com.ustglobal.stockmanagementsystem.dto.Order_info;
import com.ustglobal.stockmanagementsystem.dto.Products_Info;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDAO dao;

//	@Autowired
//	private Validation val;

	@Override
	public Products_Info getProductByName(String name) {
		return dao.getProductByName(name);
	}

	@Override
	public List<Products_Info> getProductByCategory(String category) {
		return dao.getProductByCategory(category);
	}

	@Override
	public List<Products_Info> getProductByCompany(String company) {
		return dao.getProductByCompany(company);
	}

	@Override
	public boolean addProduct(Products_Info product) {
		if (product != null) {
			return dao.addProduct(product);
		} else {
			return false;
		}
	}

	@Override
	public boolean updateProduct(Products_Info product) {
		if (product != null) {
			return dao.updateProduct(product);
		} else {
			return false;
		}
	}

	@Override
	public boolean deleteProductById(int id) {
		if (id != 0) {
			return dao.deleteProductById(id);
		} else {
			return false;
		}
	}

	@Override
	public List<Products_Info> showAllProducts() {
		return dao.showAllProducts();
	}

	@Override
	public boolean generateBill(List<Products_Info> beans, double total_price, double total_price_with_gst) {
		return dao.generateBill(beans, total_price, total_price_with_gst);
	}

}
