package com.lansmancai.lantransaction;

import com.lansmancai.lantransaction.dao.RoleDao;
import com.lansmancai.lantransaction.dao.UserDao;
import com.lansmancai.lantransaction.dao.impl.RoleDaoImpl;
import com.lansmancai.lantransaction.dao.impl.UserDaoImpl;
import com.lansmancai.lantransaction.service.RoleService;
import com.lansmancai.lantransaction.service.UserService;
import com.lansmancai.lantransaction.service.impl.RoleServiceImpl;
import com.lansmancai.lantransaction.service.impl.UserServiceImpl;
import com.lansmancai.lantransaction.ui.LoginFrame;

/**
 * 事务管理系统入口
 */
public class Main {

	public static void main(String[] args) {
		LoginFrame lf = new LoginFrame();
	}

}
