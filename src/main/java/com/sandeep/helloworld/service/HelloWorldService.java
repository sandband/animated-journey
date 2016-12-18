package com.sandeep.helloworld.service;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class HelloWorldService {
	public String getDesc() {
		return "My first MVC!!!";
	}

	public String getTitle(String name) {
		return "Hello" + (StringUtils.isEmpty(name) ? "World" : name) + "!!";
	}
}
