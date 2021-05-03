package com.cg.service;

import com.cg.exceptions.BalException;
import com.cg.exceptions.IdException;

public interface ISer {

	public boolean transferFund(int fid, int tid, double amt)throws BalException, IdException;
}
