package com.lansmancai.lantransaction.dao;

import java.util.List;

import com.lansmancai.lantransaction.model.UserTransfer;

/**
 * ����ת����¼
 */
public interface UserTransferDao {

	/**
	 * ����һ��ת����¼
	 * @param ut
	 */
	void save(UserTransfer ut);
	
	/**
	 * �����û�����ת��������ת����¼
	 * @param userId
	 * @return
	 */
	List<UserTransfer> find(String userId);
}
