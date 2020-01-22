package com.capgemini.empwebapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.empwebapp.beans.EmployeeInfoBeans;

public class EmployeeDAOJpaImpl implements EmployeeDAO {

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("Shiva");

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
     
		EntityManager em=emf.createEntityManager();
		EmployeeInfoBeans existingemployeeInfo =em.find(EmployeeInfoBeans.class,employeeInfoBeans.getEmpId() );
        EntityTransaction tr=em.getTransaction();
		boolean isUpdated=false;
		
		if(existingemployeeInfo !=null) {
			String name =employeeInfoBeans.getEmpName();
			if(name !=null) {
				existingemployeeInfo.setEmpName(name);
			}
			
			int age = employeeInfoBeans.getAge();
			if(age > 18) {
				existingemployeeInfo.setAge(age);
			}
			
			double salary=employeeInfoBeans.getSalary();
			if(salary > 0) {
				existingemployeeInfo.setSalary(salary);
			}
			
			long mobile =employeeInfoBeans.getMobile();
			if(mobile>0) {
				existingemployeeInfo.setMobile(mobile);
			}
			
			String designation= employeeInfoBeans.getDesignation();
			if(designation != null) {
				existingemployeeInfo.setDesignation(designation);
			}
			
			char gender =employeeInfoBeans.getGender();
			if(gender== 'M' || gender== 'F' || gender== 'm' ||gender== 'f') {
				existingemployeeInfo.setGender(gender);
			}
			
			String pwd =employeeInfoBeans.getPassword();
			if(pwd != null) {
				existingemployeeInfo.setPassword(pwd);
			}
		
		try {
			tr.begin();
			em.persist(employeeInfoBeans);
			tr.commit();
			
		    isUpdated=true;
			}  catch (Exception e) {
			e.printStackTrace();
		 }
		em.close();
	   }
		
	 return isUpdated;
	}//updateEmployee
}// End of class