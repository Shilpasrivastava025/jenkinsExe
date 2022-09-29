package StringsPrograms;

import java.util.LinkedHashSet;

public class PrintPositionOfEachCharacterInString {

	public static void main(String[] args) {
		String s= "tester";
		//LinkedHashSet<Character> set= new LinkedHashSet<Character>();
		for(int i= 0; i<s.length();i++)
		{
			System.out.println(s.charAt(i) +" "+(i+1));
		}

	}

}
