package com.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {
	@Autowired
	private Principal principal;
	
	@Autowired
	@Qualifier("scienceTeacher")
	private Teacher teacher;
	
	@Value("${college.name}")
	private String collegeName;
	/*
	 * public College(Principal principal) { super(); this.principal = principal; }
	 */


	/*
	 * @Autowired public void setTeacher(Teacher teacher) { this.teacher = teacher;
	 * }
	 */



	public void test() {
		principal.principalInfo();
		teacher.teach();
		System.out.println("My college name is: "+ collegeName);
		System.out.println("testing done");
	}


	/*
	 * @Autowired public void setPrincipal(Principal principal) { this.principal =
	 * principal; System.out.println("Injection using Setter method"); }
	 */
}
