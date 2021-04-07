package com.wolken.wolkenapp.Exception;

public class mobileException extends Exception {
	@Override
	public String getMessage() {
		return "this index is deleted";
		
	}
	public String toString() {
		return "exception occured bcz it contains null value";
		
	}
	
}
