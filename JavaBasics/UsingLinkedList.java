package com.learningbasicsjava1;

import java.util.LinkedList;

class Linkedlist
{
	void get_list()
	{
		LinkedList list=new LinkedList();
		list.add("Ishan");
		list.add(45);
		list.add("SKY");
		list.add(68);
		list.add("Rishab");
		list.add("75.2");
		System.out.println("Printing A Given List");
		System.out.println(list);
		list.addFirst(10000);
		list.addLast(10000);
		System.out.println("after adding an elements");
		System.out.println(list);
		System.out.println("size of list is "+list.size());
		list.addAll(list);
		System.out.println("after adding all in list");
		System.out.println(list);
	}
}
public class UsingLinkedList {

	public static void main(String[] args) {
		Linkedlist obj=new Linkedlist();
		obj.get_list();

	}

}
