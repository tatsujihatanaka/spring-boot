package com.tuyano.springboot.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParamController {
	@RequestMapping("/param/{num}")
	public String param(@PathVariable int num) {
		int res = 0;
		for(int i = 1; i <= num; i++) {
			res += i;
		}
	return "total: " + res;
	}
}
