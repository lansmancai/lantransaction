package com.lansmancai.lantransaction.service.impl;

import java.util.List;

import com.lansmancai.lantransaction.dao.RoleDao;
import com.lansmancai.lantransaction.dao.UserDao;
import com.lansmancai.lantransaction.model.Role;
import com.lansmancai.lantransaction.model.User;
import com.lansmancai.lantransaction.service.BusinessException;
import com.lansmancai.lantransaction.service.UserService;
import com.lansmancai.lantransaction.util.ApplicationContext;

public class UserServiceImpl implements UserService {

	private UserDao userDao;
	
	private RoleDao roleDao;
	
	public UserServiceImpl(UserDao userDao, RoleDao roleDao) {
		this.userDao = userDao;
		this.roleDao = roleDao;
	}
	
	public void login(String userName, String passwd) {
		User user = this.userDao.findUser(userName, passwd);
		//û���ҵ��û�, �׳��쳣
		if (user == null) throw new BusinessException("�û����������");
		Role role = this.roleDao.find(user.getROLE_ID());
		user.setRole(role);
		ApplicationContext.loginUser = user;
	}

	public List<User> getUsers() {
		List<User> users = this.userDao.findUsers();
		for (User u : users) {
			Role role = this.roleDao.find(u.getROLE_ID());
			u.setRole(role);
		}
		return users;
	}

	/*
	 * ����û�
	 * @see com.lansmancai.lantransaction.service.UserService#addUser(com.lansmancai.lantransaction.model.User)
	 */
	public void addUser(User user) {
		//�����µ��û���ȥ����, �ж��Ƿ������ͬ�û������û�
		User u = this.userDao.findUser(user.getUSER_NAME());
		if (u != null) throw new BusinessException("���û����Ѿ�����");
		this.userDao.save(user);
	}

	/*
	 * ɾ���û�, ���û���IS_DELETE������Ϊ1
	 * @see com.lansmancai.lantransaction.service.UserService#delete(java.lang.String)
	 */
	public void delete(String id) {
		//���һ���û�����ɾ��
		if (this.userDao.getUserCount() <= 1) {
			throw new BusinessException("���һ���û�����ɾ��");
		}
		this.userDao.delete(id);
	}

	public List<User> query(String realName) {
		List<User> users = this.userDao.query(realName);
		for (User u : users) {
			Role role = this.roleDao.find(u.getROLE_ID());
			u.setRole(role);
		}
		return users;
	}

	
}
