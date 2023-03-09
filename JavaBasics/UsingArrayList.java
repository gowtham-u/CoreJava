package com.learningbasicsjava1;

import java.util.ArrayList;

class UsingArrays
{
	void get_arrays()
	{
		ArrayList array=new ArrayList();
		array.add("Ishan");
		array.add(45);
		array.add("SKY");
		array.add(68);
		array.add("Rishab");
		array.add("75.2");
		System.out.println("Size of an Given ArrayList is "+array.size());
		System.out.println(array);
		array.add(3,"Dhoni");
		System.out.println("After adding new element");
		System.out.println(array);
		array.add("SKY");
		System.out.println("after adding duplicate value");
		System.out.println(array);
		array.remove(2);
		System.out.println("after removing one value");
		System.out.println(array);
		
	}
}
public class UsingArrayList {

	public static void main(String[] args) {
		UsingArrays obj=new UsingArrays();
		obj.get_arrays();

	}

}
