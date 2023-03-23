package com.learningbasicsjava1;

abstract class UsingAbstract
{
	abstract void add();    //we are declaring only method, its not having body.
	void print()
	{
		System.out.println("This is a form of abstract class");
	}
}
public class AbstractClassDemo extends UsingAbstract {
	@Override
	void add()
	{
		System.out.println("this is a form of abstract class");
	}
	
	public static void main(String[] args) {
		AbstractClassDemo obj=new AbstractClassDemo();
		obj.add();
		obj.print();	
		
	}
	
}
