package POJOLibraies;

import java.util.Random;

public class JavaLibrary {
	
	public int getRandomNumber()
	{
		Random ran= new Random();
		int RanNum = ran.nextInt(1000);
		return RanNum;
		
				
	}

}
