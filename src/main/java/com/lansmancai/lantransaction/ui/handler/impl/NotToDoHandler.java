package com.lansmancai.lantransaction.ui.handler.impl;

import com.lansmancai.lantransaction.model.Comment;
import com.lansmancai.lantransaction.ui.handler.TransactionHandler;
import com.lansmancai.lantransaction.util.ApplicationContext;

/**
 * ���������Ĵ�����
 */
public class NotToDoHandler implements TransactionHandler {

	public void handler(Comment comment) {
		//ѡ������״̬�ı�Ϊ����, ���������
		ApplicationContext.transactionService.notToDo(comment.getTRANSACTION_ID(), 
				comment.getUSER_ID(), comment);
//		ApplicationContext.commentService.save(comment);
	}

}
