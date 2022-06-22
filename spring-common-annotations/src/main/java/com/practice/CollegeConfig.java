package com.practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.practice")
@PropertySource("classpath:college-info.properties")
public class CollegeConfig {

	/*
	 * @Bean public Principal principalBean() { return new Principal(); }
	 * 
	 * @Bean(name = { "colBean", "collegeBean"}) public College collegeBean() {
	 * College college= new College(); college.setPrincipal(principalBean());
	 * college.setTeacher(mathTeacherBean()); return college; }
	 * 
	 * @Bean public Teacher mathTeacherBean() { return new MathTeacher(); }
	 */
}
