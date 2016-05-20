package com.smis.test.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.smis.test.vo.TestVo;

@Path("/test")
@Produces(MediaType.APPLICATION_JSON)
public interface ITestService {
	@GET
	@Path("/test")
	public TestVo test();
}
