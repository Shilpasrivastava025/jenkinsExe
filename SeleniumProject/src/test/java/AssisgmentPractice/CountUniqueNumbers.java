package AssisgmentPractice;

import java.util.Scanner;

public class CountUniqueNumbers {

	public static void main(String[] args) {
		
		int [] a = {4,1,1,3,5,6,7,6};

		for (int j= 0; j < a.length; j++)
		{
		int count = 0;
		for (int i = 0; i < a.length; i++)
		{
		     if(a[i] == a[j] )
		     {    
		      count++;
		  }
	   }
		    if(count == 1 )
		    { 
		    	System.out.println(a[j]);
		 }
		    
		}
	}
}