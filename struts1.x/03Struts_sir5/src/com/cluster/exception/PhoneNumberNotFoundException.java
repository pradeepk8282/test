package com.cluster.exception;

public class PhoneNumberNotFoundException extends RuntimeException{
	String msg; 
	public PhoneNumberNotFoundException(String msg) {
		this.msg=msg;
	}
	public String toString(){
		return msg;
	}
	public String getMessage(){
		return msg;
	}
}
