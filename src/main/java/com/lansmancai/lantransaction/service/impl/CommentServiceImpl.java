package com.lansmancai.lantransaction.service.impl;

import java.util.Date;

import com.lansmancai.lantransaction.dao.CommentDao;
import com.lansmancai.lantransaction.dao.TransactionDao;
import com.lansmancai.lantransaction.dao.UserDao;
import com.lansmancai.lantransaction.model.Comment;
import com.lansmancai.lantransaction.service.CommentService;
import com.lansmancai.lantransaction.util.ViewUtil;

public class CommentServiceImpl implements CommentService {

	private CommentDao commentDao;
	
	private TransactionDao transactionDao;
	
	private UserDao userDao;
	
	public CommentServiceImpl(CommentDao commentDao, TransactionDao transactionDao, 
			UserDao userDao) {
		this.commentDao = commentDao;
		this.transactionDao = transactionDao;
		this.userDao = userDao;
	}
	
	public void save(Comment comment) {
		this.commentDao.save(comment);
	}

}
