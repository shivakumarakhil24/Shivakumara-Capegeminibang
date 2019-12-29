package com.ustglobal.librarymanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.librarymanagementsystem.dao.AdminDAO;
import com.ustglobal.librarymanagementsystem.dto.UserBean;
import com.ustglobal.librarymanagementsystem.validation.Validation;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDAO dao;
	@Autowired
	private Validation val;

	@Override
	public UserBean userLogin(int userId, String userPassword) {
		if (userId != 0 || userPassword != null && val.validatePassword(userPassword)) {
			return dao.userLogin(userId, userPassword);
		} else if (userPassword.length() >= 8) {
			return dao.userLogin(userId, userPassword);
		}
		return null;
	}

	@Override
	public boolean addStudent(UserBean bean) {
		if (val.validateName(bean.getUserName()) && val.validateEmail(bean.getUserEmail())
				&& val.validatePassword(bean.getUserPassword())) {
			return dao.addStudent(bean);
		} else {
			return false;
		}
	}
	
	@Override
	public List<UserBean> searchAllUser() {
		return dao.searchAllUser();
	}

	@Override
	public boolean addLibrarian(UserBean bean) {
		if (bean != null && val.validateName(bean.getUserName()) && val.validateEmail(bean.getUserEmail())
				&& val.validatePassword(bean.getUserPassword())) {
			return dao.addLibrarian(bean);
		} else {
			return false;
		}
	}

	@Override
	public UserBean searchUser(int userId) {
		if (userId != 0) {
			return dao.searchUser(userId);
		} else {
			return null;
		}
	}

	@Override
	public boolean registerUser(UserBean bean) {
		if(bean != null && val.validateName(bean.getUserName()) && val.validateEmail(bean.getUserEmail())
				&& val.validatePassword(bean.getUserPassword())) {
			return dao.registerUser(bean);
		}else {
			return false;
		}
		
	}

	@Override
	public boolean removeUser(int userId) {
		if (userId != 0) {
			return dao.removeUser(userId);
		} else {
			return false;
		}
	}

	@Override
	public boolean updateUser(UserBean bean) {
		if (bean != null && val.validateName(bean.getUserName()) && val.validateEmail(bean.getUserEmail())
				&& val.validatePassword(bean.getUserPassword())) {
			return dao.updateUser(bean);
		} else {
			return false;
		}
	}

}
