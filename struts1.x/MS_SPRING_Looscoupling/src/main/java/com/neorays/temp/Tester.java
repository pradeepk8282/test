package com.neorays.temp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {
	
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
	 AImpl aImpl=context.getBean(AImpl.class);
	 A a=aImpl.getA();
	 a.hello();
	 
((AbstractApplicationContext) context).close();
	}

}
