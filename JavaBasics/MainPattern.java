package com.learningbasicjava;

class Pattern
{
	int first,second;
	void print_pattern()
	{
		for(first=1;first<=5;first++)
		{
			for(second=1;second<=first;second++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
public class MainPattern {

	public static void main(String[] args) {
		Pattern pattern=new Pattern();
		pattern.print_pattern();

	}
}
