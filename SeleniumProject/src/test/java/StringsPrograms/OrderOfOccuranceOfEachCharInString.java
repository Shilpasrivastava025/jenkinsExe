package StringsPrograms;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class OrderOfOccuranceOfEachCharInString {

	public static void main(String[] args) {
		Scanner str= new Scanner(System.in);
		String s= str.next();
		
		LinkedHashSet<Character> set= new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for(Character ch :set)
		{
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					System.out.println(ch+" "+(i+1));
					break;
				}
				
			}
		}

	}
	
}