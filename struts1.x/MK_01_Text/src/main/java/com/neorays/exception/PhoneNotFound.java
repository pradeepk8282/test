package com.neorays.exception;

public class PhoneNotFound extends RuntimeException
{
	String msg; 
	public PhoneNotFound(String msg) {
		this.msg=msg;
	}
	public String toString(){
		return msg;
	}
	public String getMessage(){
		return msg;
	}
}
