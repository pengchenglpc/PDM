package com.smis.test.service.impl;

import org.springframework.stereotype.Service;

import com.smis.test.service.ITestService;
import com.smis.test.vo.TestVo;

@Service("testServiceImpl")
public class TestServiceImpl implements ITestService {

	@Override
	public TestVo test() {
		System.out.println("hello World");
		TestVo test = new TestVo();
		test.setName("Test");
		test.setAge(26);
		test.setGender("男");
		return test;
	}

}
