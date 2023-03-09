package com.learningbasicjava;

class days
{
	int choice=5;
	void get_day()
	{
		switch(choice)
		{
		case 1:System.out.println("Sunday");
		break;
		case 2:System.out.println("Monday");
		break;
		case 3:System.out.println("Tuesday");
		break;
		case 4:System.out.println("Wednesday");
		break;
		case 5:System.out.println("Thursday");
		break;
		case 6:System.out.println("Friday");
		break;
		case 7:System.out.println("Saturday");
		break;
		
		default:System.out.println("Invalid Number");
		}
	}
}
public class dayswitch {

	public static void main(String[] args) {
		days day=new days();
		day.get_day();
	}
}
