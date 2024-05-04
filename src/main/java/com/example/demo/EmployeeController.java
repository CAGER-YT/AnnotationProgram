package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Qualifier("teacher")
	@Autowired
	Employee e;
//	Teacher t;
//	@Value("santhosh")
//	@Value("${test}") //application property variable access
	@Value("${string}")
	String name;
//	@GetMapping(value="/getname1")
//	public String getmethod() {
//		return t.getName();
//	}
	
	@GetMapping(value="/getname")
	public String getThis() {
		return name;
	}
	
	@GetMapping("/getdata")
	public String get() {
		return e.getData();
	}
}
