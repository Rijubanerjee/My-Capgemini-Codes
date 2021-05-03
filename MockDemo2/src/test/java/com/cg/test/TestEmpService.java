package com.cg.test;

import static org.mockito.Mockito.mockitoSession;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import com.cg.dao.Idao;
import com.cg.dto.Emp;
import com.cg.service.EmpException;
import com.cg.service.EmpService;

import name.falgout.jeffrey.testing.junit.mockito.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
public class TestEmpService {
	@Mock
	private Idao dao;
	@InjectMocks
	private EmpService ser = new EmpService();

	@BeforeEach
	public void setup() {
		Emp e1 = new Emp(1001, "Ram", 60000);
		Emp e2 = new Emp(1003, "Tom", 80000);
		when(dao.getemployee(1001)).thenReturn(e1);
		when(dao.getemployee(1003)).thenReturn(e2);
		when(dao.getemployee(1002)).thenReturn(null);
	}

	@Test
	public void testfindgrade1() throws EmpException {
		assertEquals("B", ser.findgrade(1001));
		verify(dao).getemployee(1001);
	}
	
	@Test
	public void testfindgrade2() throws EmpException {
		assertEquals("A", ser.findgrade(1003));
		verify(dao).getemployee(1003);
	}
	@Test
	public void testfindgrade3() {
		assertThrows(EmpException.class, () -> ser.findgrade(1002));
		verify(dao).getemployee(1002);
	}
}
