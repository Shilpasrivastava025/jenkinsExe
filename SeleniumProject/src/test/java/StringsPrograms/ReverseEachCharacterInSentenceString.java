package StringsPrograms;

public class ReverseEachCharacterInSentenceString {

	public static void main(String[] args) {
		String str= "welcome to bangalore city";
		String[] s= str.split(" ");
		
		for(int i=0;i<s.length;i++)
		{
			String strn=s[i];
			//s[i]= welcome to bangalore city
			//        0     1     2        3
			for(int j=strn.length()-1;j>=0;j--)
			{
				System.out.print(strn.charAt(j));
			}
			System.out.print(" ");
		}

	}

}
