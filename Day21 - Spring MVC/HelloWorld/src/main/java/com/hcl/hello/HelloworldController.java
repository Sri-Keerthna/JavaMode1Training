package com.hcl.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloworldController {
@RequestMapping("/hello")
public ModelAndView helloWorld(){
	return new ModelAndView("result","message","welcome to Spring..");
}
@RequestMapping("/bhargav")
public ModelAndView helloBhargav(){
	return new ModelAndView("result","message","welcome Bhargav..");
}

}
