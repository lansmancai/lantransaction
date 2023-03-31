package com.lansmancai.lantransaction.ui.handler.impl;

import com.lansmancai.lantransaction.ui.dialog.NewTransactionDialog;
import com.lansmancai.lantransaction.ui.handler.UserSelectHandler;

public class NewTransactionUserSelectHandler implements UserSelectHandler {
	//�½�����Ĵ���
	private NewTransactionDialog newDialog;
	public NewTransactionUserSelectHandler(NewTransactionDialog newDialog) {
		this.newDialog = newDialog;
	}
	public void confirm(String userId, String realName) {
		//�ı��������ڵĴ������ı����ֵ
		this.newDialog.getHandlerField().setText(realName);
		this.newDialog.getHandlerIdField().setText(userId);
	}
}
