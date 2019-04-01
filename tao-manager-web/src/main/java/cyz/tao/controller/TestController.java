package cyz.tao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cyz.tao.service.TestService;

/**
 * 测试使用的controller：查询当前的时间
 * @author yanzhou.chen
 *
 */
public class TestController {
	
	@Autowired
	private TestService testservice;
	
	@RequestMapping("/test/queryNow")
	@ResponseBody
	public String queryNow() {
		//1、引入服务（springmvc）
		//2、注入服务
		//3、调用服务的方法
		return testservice.queryNow();
	}
	
}
