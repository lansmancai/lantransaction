package com.lansmancai.lantransaction.service;

import com.lansmancai.lantransaction.model.Comment;

public interface CommentService {

	/**
	 * 保存一个事务评论
	 * @param comment 评论对象
	 */
	void save(Comment comment);
}
