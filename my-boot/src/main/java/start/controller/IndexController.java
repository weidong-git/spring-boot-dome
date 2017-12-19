package start.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import start.bean.Demo;

@RestController
public class IndexController {
	@RequestMapping("/hello")
	public String helloNew(){
		return "hello";
	}
	
	@RequestMapping("/test")
	public String helloString(){
		return "helloString";
	}
	
    /**
	* Spring Boot默认使用的json解析框架是jackson
	* @return
	*/
	@RequestMapping("/getDemo")
	public Demo getDemo(){
		Demo demo = new Demo();
		demo.setId(1);
		demo.setName("张三的");
		demo.setCreateTime(new Date());
		demo.setRemarks("这是备注信息的");
		return demo;
	}

}
