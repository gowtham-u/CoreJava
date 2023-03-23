package com.learningbasicsjava1;

import java.util.Vector;

class UsingVector
{
	void get_vector()
	{
		Vector vector=new Vector();
		vector.add("Ishan");
		vector.add(45);
		vector.add("SKY");
		vector.add(67);
		vector.add("rishab");
		vector.add(75.2);
		System.out.println("Capacity of an given List is "+vector.capacity());
		System.out.println(vector);
		vector.addAll(vector);
		System.out.println("after adding all elements");
		System.out.println(vector);
		System.out.println("Capacity of an new List is "+vector.capacity());
		vector.add(100);
		System.out.println("after adding a new value");
		System.out.println(vector);
		System.out.println("Capacity of an new List is "+vector.capacity());
		vector.remove(5);
		System.out.println("after removing an element");
		System.out.println(vector);
		System.out.println("Capacity of an after removing a element List is "+vector.capacity());
		vector.add(110);
		System.out.println("after adding one more element");
		System.out.println(vector);
		System.out.println("Capacity of an new List is "+vector.capacity());
		System.out.println("Size of an List is "+vector.size());
	}
}
public class UsingVectorClass {

	public static void main(String[] args) {
		UsingVector obj=new UsingVector();
		obj.get_vector();

	}

}
