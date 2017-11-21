package org.mbusa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ViewController {
	
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String goHome() {
		return "index";
	}
	@RequestMapping(path = "/index.html", method = RequestMethod.GET)
	public String goIndex() {
		return "index";
	}
	@RequestMapping(path = "/thankYou", method = RequestMethod.GET)
	public String thankYouView() {
		return "thankYou";
	}
}
