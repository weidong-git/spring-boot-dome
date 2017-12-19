package start.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import start.mybatis.bean.Demo;
import start.mybatis.mapper.DemoMappper;

@Service
public class DemoService {

	@Autowired
	private DemoMappper demoMappper;
	
	public List<Demo> likeName(String name){
		return demoMappper.likeName(name);
	}
	
	@Transactional//添加事务.
	public void save(Demo demo){
		demoMappper.save(demo);
	}
	
}
