package com.lansmancai.lantransaction.dao;

import java.util.List;

import com.lansmancai.lantransaction.model.Role;

public interface RoleDao {

	/**
	 * ����ID���ҽ�ɫ
	 * @param id
	 * @return
	 */
	Role find(String id);
	
	/**
	 * ����ȫ���Ľ�ɫ
	 * @return
	 */
	List<Role> findRoles();
}
