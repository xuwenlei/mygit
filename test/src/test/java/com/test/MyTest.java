package com.test;

import java.util.List;

import org.junit.Test;

import com.dao.SpecialDao;
import com.entities.SpecialDomain;
import com.utils.MyUtils;

public class MyTest {
	
	@Test
	public void testSpecial(){
		SpecialDao specialDao = new SpecialDao(MyUtils.ServerEnum.development);
		List<SpecialDomain> special = specialDao.getSpecial();
		System.out.println(special);
	}
	
}
