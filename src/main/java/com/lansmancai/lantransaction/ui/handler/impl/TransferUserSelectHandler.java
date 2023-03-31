package com.lansmancai.lantransaction.ui.handler.impl;

import com.lansmancai.lantransaction.ui.dialog.TransferTransactionDialog;
import com.lansmancai.lantransaction.ui.handler.UserSelectHandler;

public class TransferUserSelectHandler implements UserSelectHandler {
	//ת������Ĵ�����
	private TransferTransactionDialog dialog;
	public TransferUserSelectHandler(TransferTransactionDialog dialog) {
		this.dialog = dialog;
	}
	public void confirm(String userId, String realName) {
		this.dialog.getUserIdText().setText(userId);
		this.dialog.getRealNameText().setText(realName);
	}
}
