package cyz.tao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cyz.tao.mapper.TestMapper;
import cyz.tao.service.TestService;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	private TestMapper mapper;
	
	@Override
	public String queryNow() {
		//1、注入mapper
		
		//2、调用mapper的方法 返回
		return mapper.queryNow();
	}

}
