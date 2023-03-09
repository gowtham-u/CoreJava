package com.learningbasicjava;

class Printnumber
{
	int value;
	void Print_number()
	{
		value=10;
		do
			{
				System.out.println(value);
				value--;
			}while(value>=1);
	}
	
}
public class DoWhileDemo {

	public static void main(String[] args) {
		Printnumber Print=new Printnumber();
		Print.Print_number();

	}

}
