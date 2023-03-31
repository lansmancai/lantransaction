package com.lansmancai.lantransaction.dao;

import java.util.List;

import com.lansmancai.lantransaction.model.UserTransfer;

/**
 * 事务转发记录
 */
public interface UserTransferDao {

	/**
	 * 保存一条转发记录
	 * @param ut
	 */
	void save(UserTransfer ut);
	
	/**
	 * 查找用户进行转发操作的转发记录
	 * @param userId
	 * @return
	 */
	List<UserTransfer> find(String userId);
}
