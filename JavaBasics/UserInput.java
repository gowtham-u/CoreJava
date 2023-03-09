package com.learningbasicsjava1;

import java.util.Scanner;

class AreaofSquare
{
	int num, area;
	void areaofsquare(int value)
	{
		area = value*value;
		System.out.println("Area of Square is "+area);
	}
}
public class UserInput {

	public static void main(String[] args) {
		AreaofSquare Area=new AreaofSquare();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		Area.num=sc.nextInt();
		Area.areaofsquare(Area.num);
				

	}

}
