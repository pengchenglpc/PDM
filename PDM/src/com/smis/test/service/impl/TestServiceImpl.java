package com.smis.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smis.test.dao.ITestDao;
import com.smis.test.service.ITestService;
import com.smis.test.vo.TestVo;

@Service("testServiceImpl")
public class TestServiceImpl implements ITestService {
	@Autowired
	private ITestDao testDao;
	
	@Override
	public TestVo test() {
		System.out.println("hello World");
		return testDao.findAll().get(0);
	}

}
