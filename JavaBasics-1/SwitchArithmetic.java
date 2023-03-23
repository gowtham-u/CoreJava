package com.learningbasicjava;
import java.util.Scanner;
class Arithmetic
{
	int firstnumber,secondnumber,result;
	String option;
	void switch_arith()
	{
		Scanner s=new Scanner(System.in); 
		System.out.println("Enter a FirstNumber :");
		firstnumber=s.nextInt();
		System.out.println("Enter a SecondNumber :");
		secondnumber=s.nextInt();
		
		System.out.println("ADDITION");
		System.out.println("SUBTRACTION");
		System.out.println("MULTIPLICATION");
		System.out.println("DIVISION");
		System.out.println("MODULUS");
		System.out.println("Enter a Option : ");
		option=s.next();
		switch(option)
		{
		case "add":result=firstnumber+secondnumber;
		System.out.println("Addition of given number is "+result);
		break;
		
		case "sub":result=firstnumber-secondnumber;
		System.out.println("Subtraction of given number is "+result);
		break;
		
		case "mul":result=firstnumber*secondnumber;
		System.out.println("Multiplication of given number is "+result);
		break;
		
		case "div":result=firstnumber/secondnumber;
		System.out.println("Division of given number is "+result);
		break;
		
		case "mod":result=firstnumber%secondnumber;
		System.out.println("Modulus of given number is "+result);
		break;
		
		default:System.out.println("Invalid Option");
		
		}
	}
}
public class SwitchArithmetic {

	public static void main(String[] args) {
		Arithmetic maths=new Arithmetic();
		maths.switch_arith();
	}
}
