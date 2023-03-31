package com.lansmancai.lantransaction.dao;

import com.lansmancai.lantransaction.model.Comment;

public interface CommentDao {

	/**
	 * ����һ����������
	 * @param comment
	 */
	Integer save(Comment comment);
	
	/**
	 * ����ID��������
	 * @param id
	 * @return
	 */
	Comment find(String id);
}
