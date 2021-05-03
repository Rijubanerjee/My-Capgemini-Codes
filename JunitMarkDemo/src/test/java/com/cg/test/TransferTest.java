package com.cg.test;

import static org.junit.jupiter.api.Assumptions.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.cg.dao.IDao;
import com.cg.exceptions.BalException;
import com.cg.exceptions.IdException;
import com.cg.service.ISer;
import com.cg.service.SerImpl;
import com.cg.dto.Account;

import name.falgout.jeffrey.testing.junit.mockito.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
public class TransferTest {
    
	static Account acc1, acc2;
	
	@Mock
	IDao dao;
	
	@InjectMocks
	ISer ser = new SerImpl();
	
	@BeforeAll 
	public static void BeforeAll() {
		acc1 = new Account(1001, "ram", 25000);
		acc2 = new Account(1002, "tom", 10000);
	}
	@SuppressWarnings("unchecked")
	@BeforeEach
	public void beforeEach() throws IdException {
		when(dao.getAccount(1001)).thenReturn(acc1);
		when(dao.getAccount(1002)).thenReturn(acc2);
		when(dao.getAccount(1003)).thenThrow(IdException.class);
	}
	
	@Test
	public void testTransfer1() throws BalException, IdException {
		assertAll(()->assertTrue(ser.transferFund(1001, 1002, 5000)));
				//  ()->assertEquals(20000.0, acc1.getBal()),
				 // ()->assertEquals(15000.0, acc2.getBal()));
		InOrder order = Mockito.inOrder(dao);
		order.verify(dao).getAccount(1001);
		order.verify(dao).getAccount(1002);
		
	}
	
	@Test
	public void testTransfer2() throws BalException, IdException {
		assertThrows(IdException.class,
				()->ser.transferFund(1001, 1003, 5000));
		verify(dao).getAccount(1001);
		verify(dao).getAccount(1003);
	}
	
	@Test
	public void testTransfer3() throws BalException, IdException {
		assertThrows(BalException.class,
				()->ser.transferFund(1002, 1001, 50000));
		verify(dao).getAccount(1002);
		verify(dao).getAccount(1001);
	}
	
	
}















