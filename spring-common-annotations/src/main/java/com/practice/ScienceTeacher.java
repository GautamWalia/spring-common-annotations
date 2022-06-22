package com.practice;

import org.springframework.stereotype.Component;

@Component
public class ScienceTeacher implements Teacher{

	@Override
	public void teach() {
		System.out.println("Hi, I am your Science Teacher, Dhoni");
		
	}

}
