package com.cg.service;

import com.cg.dao.IDao;
import com.cg.exceptions.BalException;
import com.cg.exceptions.IdException;
import com.cg.dto.Account;

public class SerImpl implements ISer {

	private IDao dao;

	// Setter for Mock engine to create Mock Object for Dao
	public void setDao(IDao dao) {
		System.out.println("injecting mock");
		this.dao = dao;
	}

	@Override
	public boolean transferFund(int fid, int tid, double amt) throws BalException, IdException {

		Account fromAccount = dao.getAccount(fid);
		Account toAccount = dao.getAccount(tid);

		if (fromAccount.getBal() >= amt) {
			fromAccount.setBal(fromAccount.getBal() - amt);
			toAccount.setBal(toAccount.getBal() + amt);
			return true;
		} else {
			throw new BalException("Insufficient Balance");
		}

		
	}

}
