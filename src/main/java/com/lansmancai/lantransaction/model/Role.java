package com.lansmancai.lantransaction.model;

/**
 * ��ɫ��
 */
public class Role extends ValueObject {
	
	//��ɫ����, �羭��, �ܼ�
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
