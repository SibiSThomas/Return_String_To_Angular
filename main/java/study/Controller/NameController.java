package study.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import study.Service.I_HelloService;

@Controller
@CrossOrigin
public class NameController {
	@Autowired
	private I_HelloService helloService;
	
	@GetMapping("/hello")
	@ResponseBody
	public String getName(@RequestParam String name) {
		return helloService.greet(name);
		
	}
	
	
}
