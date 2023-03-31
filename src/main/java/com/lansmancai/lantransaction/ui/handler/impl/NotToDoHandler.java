package com.lansmancai.lantransaction.ui.handler.impl;

import com.lansmancai.lantransaction.model.Comment;
import com.lansmancai.lantransaction.ui.handler.TransactionHandler;
import com.lansmancai.lantransaction.util.ApplicationContext;

/**
 * 决定不做的处理类
 */
public class NotToDoHandler implements TransactionHandler {

	public void handler(Comment comment) {
		//选择将事务状态改变为不做, 再添加评论
		ApplicationContext.transactionService.notToDo(comment.getTRANSACTION_ID(), 
				comment.getUSER_ID(), comment);
//		ApplicationContext.commentService.save(comment);
	}

}
