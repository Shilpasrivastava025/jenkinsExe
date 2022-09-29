package StringsPrograms;

import java.util.HashSet;

public class CountOfduplicateCharactersinString {

	public static void main(String[] args) {
		String s= "tester";
		HashSet<Character> set= new HashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for(Character ch:set)
		{
			int count=0;
			for(int i=0;i<s.length();i++)
		{
			if(ch==s.charAt(i))
			{
				count++;
			}
		}
			if(count>1) //duplicate
			{
				System.out.println(ch+" "+count);
			}
		}

	}
}
