package com.learningbasicjava;

class switchchar
{
	char ch='c';
	void print_com()
	{
		switch(ch)
		{
		case 'a':System.out.println("AMAZON");
		break;
		
		case 'g':System.out.println("GOOGLE");
		break;
		
		case 'm':System.out.println("MICROSOFT");
		break;
		
		case 'c':System.out.println("COGNIZENT");
		break;
		
		case 'w':System.out.println("WIPRO");
		break;
		
		default:System.out.println("No companies available");
		}
	}
}
public class SwitchChar {

	public static void main(String[] args) {
		switchchar company=new switchchar();
		company.print_com();

	}

}
