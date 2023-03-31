package com.lansmancai.lantransaction.model;

/**
 * 角色表
 */
public class Role extends ValueObject {
	
	//角色名称, 如经理, 总监
	private String ROLE_NAME;

	public String getROLE_NAME() {
		return ROLE_NAME;
	}

	public void setROLE_NAME(String role_name) {
		ROLE_NAME = role_name;
	}

	public String toString() {
		return this.ROLE_NAME;
	}
}
