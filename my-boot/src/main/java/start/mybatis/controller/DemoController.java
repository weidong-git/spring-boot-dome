package start.mybatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;

import start.common.PageMethod;
import start.mybatis.bean.Demo;
import start.mybatis.service.DemoService;

@RestController
public class DemoController {
	
	@Autowired
	private DemoService demoService;
	
	@RequestMapping("/likeName")
	public List<Demo> likeName(String name){
		/*
		 * 第一个参数：第几页;
		 * 第二个参数：每页获取的条数.
		 */
		PageHelper.offsetPage(1,1,true);
		PageMethod.offsetPage(1, 2);
		return demoService.likeName(name);
	}
	
	@RequestMapping("/save")
	public Demo save(){
		Demo demo = new Demo();
		demo.setName("张三");
		demoService.save(demo);
		return demo;
	}
	
}
