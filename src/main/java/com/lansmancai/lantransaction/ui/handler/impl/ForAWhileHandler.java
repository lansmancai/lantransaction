package com.lansmancai.lantransaction.ui.handler.impl;

import com.lansmancai.lantransaction.model.Comment;
import com.lansmancai.lantransaction.ui.handler.TransactionHandler;
import com.lansmancai.lantransaction.util.ApplicationContext;

public class ForAWhileHandler implements TransactionHandler {


	public void handler(Comment comment) {
		//��������Ϊ��ʱ����״̬, ��Ҫ�����������״̬, ���������
		ApplicationContext.transactionService.forAWhile(comment.getTRANSACTION_ID(), 
				comment.getUSER_ID(), comment);
//		ApplicationContext.commentService.save(comment);
	}

}
