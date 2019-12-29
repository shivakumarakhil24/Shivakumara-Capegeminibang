package com.ustglobal.mailsimulation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.mailsimulation.dao.UserDAO;
import com.ustglobal.mailsimulation.dto.Mail_info;
import com.ustglobal.mailsimulation.dto.User_info;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO dao;

	@Override
	public User_info loginUser(String email, String password) {
		return dao.loginUser(email, password);
	}

	@Override
	public boolean registerUser(User_info user) {
		return dao.registerUser(user);
	}

	@Override
	public boolean changePassword(User_info user) {
		return dao.changePassword(user);
	}

	@Override
	public boolean deleteMail(Mail_info bean) {
		return dao.deleteMail(bean);
	}

	@Override
	public boolean draftMail(Mail_info bean, User_info to, User_info from) {
		return dao.draftMail(bean, to, from);
	}

	@Override
	public List<Mail_info> getAllMail() {
		return dao.getAllMail();
	}

	@Override
	public List<Mail_info> deletedMail(Mail_info info) {
		return dao.deletedMail(info);
	}

	@Override
	public List<Mail_info> sent(Mail_info info) {
		return dao.sent(info);
	}

	@Override
	public List<Mail_info> draft(Mail_info info) {
		return dao.draft(info);
	}

	@Override
	public boolean sendMail(String subject, String msg, int to_id, int from_id) {
		return dao.sendMail(subject, msg, to_id, from_id);
	}

	@Override
	public boolean deleteMailById(int mid) {
		return dao.deleteMailById(mid);
	}

}
