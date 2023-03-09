package com.learningbasicjava;

import java.util.Scanner;
class Tables
{
	int num,i;
	Scanner sc = new Scanner(System.in);  
	void get_table()
	{
		System.out.print("Enter number: ");         
		num=sc.nextInt();  
		for(i=1; i <= 10; i++)  
		{        
		System.out.println(num+" * "+i+" = "+num*i);  
		}  
	}
}
public class Main13Table {

	public static void main(String[] args) {
		Tables tobj=new Tables();
		tobj.get_table();

	}

}
