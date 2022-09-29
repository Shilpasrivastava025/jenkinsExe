package StringsPrograms;

import java.util.LinkedHashSet;

public class RemoveDuplicatesWordsInSentence {

	public static void main(String[] args) {
		String s= "welcome to to bangalore bangalore city";
		String[] str= s.split(" ");
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(int i=0; i<str.length; i++)
		{
			set.add(str[i]);
		}
		System.out.println(set);

	}

}
