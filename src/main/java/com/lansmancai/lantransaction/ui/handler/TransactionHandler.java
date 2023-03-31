package com.lansmancai.lantransaction.ui.handler;

import com.lansmancai.lantransaction.model.Comment;

/**
 * 事务处理接口
 */
public interface TransactionHandler {

	/**
	 * 处理某个事务
	 * @param comment
	 */
	void handler(Comment comment);
}
