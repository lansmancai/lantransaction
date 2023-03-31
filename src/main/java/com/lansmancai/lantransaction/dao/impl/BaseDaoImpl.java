package com.lansmancai.lantransaction.dao.impl;

import java.sql.ResultSet;
import java.util.Collection;

import com.lansmancai.lantransaction.jdbc.JDBCExecutor;
import com.lansmancai.lantransaction.model.ValueObject;
import com.lansmancai.lantransaction.util.DataUtil;

public class BaseDaoImpl {
	//����JDBCExecutor����
	public JDBCExecutor getJDBCExecutor() {
		return JDBCExecutor.getJDBCExecutor();
	}
	
	//���ݲ�����SQL, ��Ž���ļ��϶���, �;�������ݿ�ӳ����󷵻�һ������
	public Collection getDatas(String sql, Collection<ValueObject> result, 
			Class clazz) {
		//ִ��SQL����ResultSet����
		ResultSet rs = getJDBCExecutor().executeQuery(sql);
		System.out.println(sql);
		//��ResultSet���з�װ�����ؼ���
		return DataUtil.getDatas(result, rs, clazz);
	}
}
