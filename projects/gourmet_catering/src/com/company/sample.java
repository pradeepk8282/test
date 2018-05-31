package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class sample
{
	public static void main(String[] args) {
		
		ArrayList List =new ArrayList();
		
		List.add("add1");
		List.add("add2");
		
		Iterator iterator=List.iterator();
		List.add("add3");
		while(iterator.hasNext())
		{
			String string=(String) iterator.next();
			
			System.out.println(string);
			
		}
		
	
	}

}
