package com.smis.test.dao;

import java.util.List;

import com.smis.test.vo.TestVo;

public interface ITestDao {
	public List<TestVo> findAll();
}
