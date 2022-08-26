package com.tuyano.springboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
	@RequestMapping("/web")
	public String index() {
		return "index";
	}
	@RequestMapping("/webparam/{num}")
	public String param(@PathVariable int num, Model model) {
		int res = 0;
		for(int i = 1; i <= num; i++) {
			res += i;
		}
		model.addAttribute("msg", "total; " + res);
//		model.addAttribute("msg", "model test");
		return "index";
	}
}
