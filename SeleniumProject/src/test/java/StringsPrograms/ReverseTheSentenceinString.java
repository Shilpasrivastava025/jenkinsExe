package StringsPrograms;

public class ReverseTheSentenceinString {

	public static void main(String[] args) {
		String str= "welcome to Bnglr city";
		String[] s= str.split(" ");
		
		for(int i=s.length-1;i>=0;i--)
		{
			System.out.print(s[i]+" ");
		}
		

	}

}
