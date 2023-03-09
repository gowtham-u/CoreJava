package com.learningbasicjava;

class Reverse
{
	void print_rev()
	{
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
		}
	}
}
public class MainReverse {

	public static void main(String[] args) {
		Reverse print=new Reverse();
		print.print_rev();
	}

}
