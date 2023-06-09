package com.lansmancai.lantransaction.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.lansmancai.lantransaction.dao.RoleDao;
import com.lansmancai.lantransaction.model.Role;

public class RoleDaoImpl extends BaseDaoImpl implements RoleDao {
	public Role find(String id) {
		String sql = "select * from T_ROLE ro where ro.id = '" + id + "'";
		List<Role> result = (List<Role>)getDatas(sql, new ArrayList(), Role.class);
		return result.size() == 1 ? result.get(0) : null;
	}
	public List<Role> findRoles() {
		String sql = "select * from T_ROLE";
		return (List<Role>)getDatas(sql, new ArrayList(), Role.class);
	}	
}
