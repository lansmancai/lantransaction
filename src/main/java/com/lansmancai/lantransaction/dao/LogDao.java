package com.lansmancai.lantransaction.dao;

import java.util.List;

import com.lansmancai.lantransaction.model.Log;

public interface LogDao {

	/**
	 * ����һ����־
	 * @param log
	 */
	void save(Log log);
	
	/**
	 * ��������id������־
	 * @param transactionId
	 * @return
	 */
	List<Log> find(String transactionId);
}
