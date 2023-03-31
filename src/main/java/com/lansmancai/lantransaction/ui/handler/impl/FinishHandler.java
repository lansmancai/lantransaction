package com.lansmancai.lantransaction.ui.handler.impl;

import com.lansmancai.lantransaction.model.Comment;
import com.lansmancai.lantransaction.ui.handler.TransactionHandler;
import com.lansmancai.lantransaction.util.ApplicationContext;

/**
 * 完成事务处理类
 */
public class FinishHandler implements TransactionHandler {

	public void handler(Comment comment) {
		//将事务状态改变为完成, 再添加评论
		ApplicationContext.transactionService.finish(comment.getTRANSACTION_ID(), 
				comment.getUSER_ID(), comment);
	}

}
