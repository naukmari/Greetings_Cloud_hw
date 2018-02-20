package com.google.training.helloworld;

public class HelloClass {
    public String message = "Hello World";

    public HelloClass () {
    }

    public HelloClass (String name) {
        this.message = "Hello " + name + "!";
    }
	
	 public HelloClass (String name, String period) {
        this.message = name + ","+ "Good " + period + "!";
    }
	public HelloClass (String name, String period, String year) {
        this.message = name + ","+ " you're " + year + " years old!";
    }
    public String getMessage() {
        return message;
    }
}
