package com.learningbasicsjava1;

class Animal
{	
	Animal()
	{
		System.out.println("this is an animal constructor");
	}
	Animal(int legs)
	{
		this();
	System.out.println("this is for an animal for legs");	
	
	}
	Animal(float tail)
	{
		this(4);
	System.out.println("this is for an animal for tail");	
	}
	
	void eat()
	{
	System.out.println("this is eat method of java");	
	}
	void sound()
	{		
	}
}
public class Usingthisclass {

	public static void main(String[] args) {
Animal cat = new Animal(6);
cat.eat();
}
}