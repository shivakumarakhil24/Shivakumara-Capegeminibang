package com.ustglobal.librarymanagementsystem.dao;

import java.util.List;

import com.ustglobal.librarymanagementsystem.dto.UserBean;

public interface AdminDAO {
	public boolean registerUser(UserBean bean);

	public UserBean userLogin(int userId, String userPassword);

	public boolean addStudent(UserBean bean);

	public List<UserBean> searchAllUser();

	public UserBean searchUser(int userId);

	public boolean addLibrarian(UserBean bean);

	public boolean removeUser(int userId);

	public boolean updateUser(UserBean bean);
}
