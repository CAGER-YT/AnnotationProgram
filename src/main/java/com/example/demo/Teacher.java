package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component(value = "teacher")
public class Teacher implements Employee{

	String name;
	@Override
	public String getData() {
		// TODO Auto-generated method stub
		return "Teacher";
	}
	public String getName() {
		return name;
	}
	@Value("Santhosh")
	public void setName(String name) {
		this.name = name;
	}

	
}
