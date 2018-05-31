package com.neorays.temp;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Hello")
public class Hello  implements A{

	@Override
	public void hello() {
		System.out.println("hello world");
		
	}

}
