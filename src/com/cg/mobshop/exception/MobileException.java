package com.cg.mobshop.exception;

public class MobileException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;
	public MobileException() {
		// TODO Auto-generated constructor stub
		this.message="Exception.";
	}
	public MobileException(String message) {
		super();
		this.message = message;
	}
	
}
