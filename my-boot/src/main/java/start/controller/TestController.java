package start.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/test")
public class TestController {
	
	@RequestMapping(value="index")
	@ResponseBody
	public String test() {
		return "testdas";
	}
}
