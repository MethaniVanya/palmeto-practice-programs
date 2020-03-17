package com.examples;

public class HelloBean {
	private String name;
	public HelloBean()
	{
		
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName()
	{
		return name;
	}
	public void sayHello()
	{
		System.out.println("hello"+name);
	}

}
