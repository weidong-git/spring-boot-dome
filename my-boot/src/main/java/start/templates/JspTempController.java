package start.templates;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jsp")
public class JspTempController {
	
	@RequestMapping("/index")
	public String index(Map<String,Object> map){
		map.put("name", "伟东");
		return "index";
	}
}
