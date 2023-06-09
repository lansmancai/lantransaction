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
		//没有找到用户, 抛出异常
		if (user == null) throw new BusinessException("用户名密码错误");
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
	 * 添加用户
	 * @see com.lansmancai.lantransaction.service.UserService#addUser(com.lansmancai.lantransaction.model.User)
	 */
	public void addUser(User user) {
		//根据新的用户名去查找, 判断是否存在相同用户名的用户
		User u = this.userDao.findUser(user.getUSER_NAME());
		if (u != null) throw new BusinessException("该用户名已经存在");
		this.userDao.save(user);
	}

	/*
	 * 删除用户, 将用户的IS_DELETE属性设为1
	 * @see com.lansmancai.lantransaction.service.UserService#delete(java.lang.String)
	 */
	public void delete(String id) {
		//最后一个用户不能删除
		if (this.userDao.getUserCount() <= 1) {
			throw new BusinessException("最后一个用户不能删除");
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
