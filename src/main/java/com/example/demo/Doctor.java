package com.example.demo;

import org.springframework.stereotype.Component;

@Component("doctor")
public class Doctor implements Employee {

	@Override
	public String getData() {
		// TODO Auto-generated method stub
		return "Doctor";
	}
	public String getMethod() {
		// TODO Auto-generated method stub
		return "Name : Santhosh";
	}

}
