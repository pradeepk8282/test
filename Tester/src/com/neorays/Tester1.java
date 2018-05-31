package com.neorays;

public class Tester1 
{
	public Tester1() {
		System.out.println("Tester");
	}
	
	public static void main(String[] args) {
		
		String s="testthismango";
		int count =0;
		char[] s1=s.toCharArray();
		
		for (int i = 0; i < s1.length; i++) {
			
			if(s1[i]=='t')
			{
				count++;
			}
			else 
			{
				continue;
			}
		}
		System.out.println("The T occourence is "+count);
		
				
	}
	
	
	
	

}
