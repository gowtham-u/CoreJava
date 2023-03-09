package com.learningbasicjava;


//import java.util.Scanner;

class Ascending
{
    void ascending()
    {
        /*Scanner sc=new Scanner(System.in);
        int n;    
        System.out.println("Enter the number of elements :");
        n=sc.nextInt();   
        
        Integer arr[]=new Integer[n];  
        System.out.println("Enter the elements of the array :");
        for(int i=0;i<n;i++)   
        {
            arr[i]=sc.nextInt();
        }*/
        int arr[]= {34,56,777,333,56767,31,722,123,1};
        int temp = 0;    
        System.out.println(arr.length);
        
         for (int i = 0; i < arr.length; i++)   
         {     
            for (int j = i+1; j < arr.length; j++)    
            {     
               if(arr[i] < arr[j]) 
               {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }      
               
            }     
        }    
          
        System.out.println();    
            
           
        System.out.println("Elements of array sorted in ascending order: ");    
        for (int i = 0; i < arr.length; i++) 
        {     
            System.out.print(" "+arr[i]);    
        }    
    }
}

public class MainAscending {

	public static void main(String[] args) {
		Ascending aobj=new Ascending();
		aobj.ascending();

	}

}