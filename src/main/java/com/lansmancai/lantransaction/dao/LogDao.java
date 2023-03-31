package com.lansmancai.lantransaction.dao;

import java.util.List;

import com.lansmancai.lantransaction.model.Log;

public interface LogDao {

	/**
	 * 保存一个日志
	 * @param log
	 */
	void save(Log log);
	
	/**
	 * 根据事务id查找日志
	 * @param transactionId
	 * @return
	 */
	List<Log> find(String transactionId);
}
