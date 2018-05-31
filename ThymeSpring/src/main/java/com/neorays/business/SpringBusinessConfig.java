package com.neorays.business;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringBusinessConfig {
	
	public SpringBusinessConfig() {
		System.out.println(this.getClass().getSimpleName());
	}

}
