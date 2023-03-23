package com.learningbasicjava;

class UsingArrays
{
	int arr[]=new int[6];
	int total=0;
	void printtotal()
	{
		int arr[]={78,46,57,89,94,60};
		for(int i=0;i<arr.length;i++)
		{
			total=total+arr[i];
		}
		System.out.println("array length is "+arr.length);
		System.out.println();
		System.out.println("Total Marks is "+total);
	}
}
public class MainArray {

	public static void main(String[] args) {
		UsingArrays aobj=new UsingArrays();
		aobj.printtotal();

	}

}
