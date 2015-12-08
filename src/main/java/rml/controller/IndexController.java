package rml.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class IndexController {

	@RequestMapping("/index")
	public String indexPage(HttpServletRequest request){
		return "/application/index";
	}
}
