package com.capgemini.springrest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.capgemini.springrest.beans.EmployeeInfoBeans;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO {
	@PersistenceUnit // @AutoWired also work
	private EntityManagerFactory emf;

	@Override
	public EmployeeInfoBeans getEmployee(int empId) {

		// EntityManagerFactory emf=Persistence.createEntityManagerFactory("Shiva");
		EntityManager em = emf.createEntityManager();
		EmployeeInfoBeans empinfobean = em.find(EmployeeInfoBeans.class, empId);
		em.close();

		return empinfobean;

	}

	@Override
	public EmployeeInfoBeans authenticate(int empId, String password) {
		EntityManager em = emf.createEntityManager();
		String jpql = "from EmployeeInfoBeans where empId= :empId and password= :password";
		Query query = em.createQuery(jpql);
		query.setParameter("empId", empId);
		query.setParameter("password", password);
		EmployeeInfoBeans employeeInfoBean = null;
		try {
			employeeInfoBean = (EmployeeInfoBeans) query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return employeeInfoBean;
	} // end of authenticate

	@Override
	public boolean addEmployee(EmployeeInfoBeans employeeInfoBeans) {

		EntityManager em = emf.createEntityManager();
		EntityTransaction tr = em.getTransaction();
		boolean isAdded = false;

		try {
			tr.begin();
			em.persist(employeeInfoBeans);
			tr.commit();
			isAdded = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		em.close();
		return isAdded;
	}// End of addEmployee

	@Override
	public boolean updateEmployee(EmployeeInfoBeans employeeInfoBeans) {

		EntityManager em = emf.createEntityManager();
		EmployeeInfoBeans existingemployeeInfo = em.find(EmployeeInfoBeans.class, employeeInfoBeans.getEmpId());
		EntityTransaction tr = em.getTransaction();
		boolean isUpdated = false;

		if (existingemployeeInfo != null) {
			String name = employeeInfoBeans.getEmpName();
			if (name != null) {
				existingemployeeInfo.setEmpName(name);
			}

			int age = employeeInfoBeans.getAge();
			if (age > 18) {
				existingemployeeInfo.setAge(age);
			}

			double salary = employeeInfoBeans.getSalary();
			if (salary > 0) {
				existingemployeeInfo.setSalary(salary);
			}

			long mobile = employeeInfoBeans.getMobile();
			if (mobile > 0) {
				existingemployeeInfo.setMobile(mobile);
			}

			String designation = employeeInfoBeans.getDesignation();
			if (designation != null) {
				existingemployeeInfo.setDesignation(designation);
			}

			char gender = employeeInfoBeans.getGender();
			if (gender == 'M' || gender == 'F' || gender == 'm' || gender == 'f') {
				existingemployeeInfo.setGender(gender);
			}

			String pwd = employeeInfoBeans.getPassword();
			if (pwd != null) {
				existingemployeeInfo.setPassword(pwd);
			}

			try {
				tr.begin();
				em.persist(existingemployeeInfo);
				tr.commit();

				isUpdated = true;
			} catch (Exception e) {
				e.printStackTrace();
			}
			em.close();
		}

		return isUpdated;
	}// updateEmployee

	@Override
	public boolean deleteEmployee(int empId) {
		EntityManager entityManager = emf.createEntityManager();
		boolean isDeleted = false;

		try {
			EntityTransaction tx = entityManager.getTransaction();
			tx.begin();
			EmployeeInfoBeans employeeInfoBean = entityManager.find(EmployeeInfoBeans.class, empId);
			entityManager.remove(employeeInfoBean);
			tx.commit();
			isDeleted = true;

		} catch (Exception e) {
			e.printStackTrace();
		}

		entityManager.close();
		return isDeleted;
	}// End of deleteEmployee()

	@Override
	public List<EmployeeInfoBeans> getAllEmployees() {
		EntityManager manager = emf.createEntityManager();
		String jpql = "from EmployeeInfoBeans";
		Query query = manager.createQuery(jpql);

		List<EmployeeInfoBeans> employeesList = null;
		try {
			employeesList = query.getResultList();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return employeesList;

	}// End of getAllEmployees()
}// End of class
