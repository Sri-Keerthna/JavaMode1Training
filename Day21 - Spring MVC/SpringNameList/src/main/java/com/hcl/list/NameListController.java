package com.hcl.list;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NameListController {
@RequestMapping("/list")
public ModelAndView nameDemo(){
	List<String> lstNames=new ArrayList<String>();
	lstNames.add("Sri");
	lstNames.add("Keerthna");
	lstNames.add("Divya");
	lstNames.add("Suganya");
	lstNames.add("Sathya");
	return new ModelAndView("result","list",lstNames);
}
}
