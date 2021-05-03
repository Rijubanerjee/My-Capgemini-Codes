package com.cg.dao;

import com.cg.exceptions.IdException;
import com.cg.dto.Account;

public interface IDao {

	public Account getAccount(int aid) throws IdException;
}
