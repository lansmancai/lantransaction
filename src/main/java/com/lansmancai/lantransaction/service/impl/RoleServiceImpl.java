package com.lansmancai.lantransaction.service.impl;

import java.util.List;

import com.lansmancai.lantransaction.dao.RoleDao;
import com.lansmancai.lantransaction.model.Role;
import com.lansmancai.lantransaction.service.RoleService;

public class RoleServiceImpl implements RoleService {

	private RoleDao roleDao;
	
	public RoleServiceImpl(RoleDao roleDao) {
		this.roleDao = roleDao;
	}

	public List<Role> getRoles() {
		return this.roleDao.findRoles();
	}
	
	
}
