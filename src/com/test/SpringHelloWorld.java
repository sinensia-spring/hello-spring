package com.test;

public class SpringHelloWorld {
	private String message;
	private static int counter = 0;
	
	public SpringHelloWorld() {
		System.out.println("Building SpringHelloWorld " + (++counter));
	}

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public String sayHello() {
		return message;
	}

}
