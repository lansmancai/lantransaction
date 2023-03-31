package com.lansmancai.lantransaction.service;

import java.util.List;

import com.lansmancai.lantransaction.model.Role;

public interface RoleService {

	/**
	 * 查找全部的角色
	 * @return
	 */
	List<Role> getRoles();
}
