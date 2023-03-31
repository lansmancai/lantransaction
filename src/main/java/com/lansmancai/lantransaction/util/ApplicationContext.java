package com.lansmancai.lantransaction.util;

import com.lansmancai.lantransaction.dao.CommentDao;
import com.lansmancai.lantransaction.dao.LogDao;
import com.lansmancai.lantransaction.dao.RoleDao;
import com.lansmancai.lantransaction.dao.TransactionDao;
import com.lansmancai.lantransaction.dao.UserDao;
import com.lansmancai.lantransaction.dao.UserTransferDao;
import com.lansmancai.lantransaction.dao.impl.CommentDaoImpl;
import com.lansmancai.lantransaction.dao.impl.LogDaoImpl;
import com.lansmancai.lantransaction.dao.impl.RoleDaoImpl;
import com.lansmancai.lantransaction.dao.impl.TransactionDaoImpl;
import com.lansmancai.lantransaction.dao.impl.UserDaoImpl;
import com.lansmancai.lantransaction.dao.impl.UserTransferDaoImpl;
import com.lansmancai.lantransaction.model.User;
import com.lansmancai.lantransaction.service.CommentService;
import com.lansmancai.lantransaction.service.RoleService;
import com.lansmancai.lantransaction.service.TransactionService;
import com.lansmancai.lantransaction.service.UserService;
import com.lansmancai.lantransaction.service.impl.CommentServiceImpl;
import com.lansmancai.lantransaction.service.impl.RoleServiceImpl;
import com.lansmancai.lantransaction.service.impl.TransactionServiceImpl;
import com.lansmancai.lantransaction.service.impl.UserServiceImpl;

/**
 * 应用上下文
 */
public class ApplicationContext {

	//系统登录用户
	public static User loginUser;

	public static UserDao userDao;
	
	public static RoleDao roleDao;
	
	public static RoleService roleService;
	
	public static UserService userService;
	
	public static TransactionDao transactionDao;
	
	public static TransactionService transactionService;
	
	public static CommentDao commentDao;
	
	public static CommentService commentService;
	
	public static UserTransferDao userTransferDao;
	
	public static LogDao logDao;
	
	static {
		logDao = new LogDaoImpl();
		roleDao = new RoleDaoImpl();
		roleService = new RoleServiceImpl(roleDao);
		userDao = new UserDaoImpl();
		userTransferDao = new UserTransferDaoImpl();
		userService = new UserServiceImpl(userDao, roleDao);
		transactionDao = new TransactionDaoImpl();
		commentDao = new CommentDaoImpl();
		transactionService = new TransactionServiceImpl(transactionDao, userDao, 
				commentDao, userTransferDao, logDao);
		
		commentService = new CommentServiceImpl(commentDao, transactionDao, userDao);
	}

}
