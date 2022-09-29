package StringsPrograms;

import java.util.LinkedHashSet;

public class PrintPositionOfStringWithoutDuplicates {

	public static void main(String[] args) {
		String s= "tester";
		//t=1
		//e=2
		//s=3
		//r=6
		LinkedHashSet<Character> set= new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for(Character ch:set)
		{
			for(int i=0;i<s.length();i++)
				// for(int i=s.lenth()-1; i>=0;i++) // for Printing Reverse order
			{
				if (ch==s.charAt(i))
				{
					System.out.println(ch+"= "+(i+1));
					
					break;
				}
			}
			
		}

	}

}
