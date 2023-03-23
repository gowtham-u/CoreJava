package com.learningbasicjava;

public class demobreak {

	public static void main(String[] args) {
		for(int i=1;i<6;i++)
		{
			if(i==3)
			{
				System.out.println(2+3);
				break;
			}
			System.out.println(i);
		}
		System.out.println();
		
		for(int i=1;i<6;i++)
		{
			if(i==3)
			{
				System.out.println(7+8);
				continue;
			}
			System.out.println(i);
		}
	}

}
