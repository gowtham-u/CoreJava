package com.learningbasicjava;

class ShowNumber
{
	int value;
	void show_number()
	{
		for(value=1;value<=10;value++)
		{
			System.out.println(value);
		}
		for(value=10-1;value>=1;value--)
		{
			System.out.println(value);
		}
	}
}
public class ForLoopDemo {

	public static void main(String[] args) {
		ShowNumber show=new ShowNumber();
		show.show_number();

	}

}
