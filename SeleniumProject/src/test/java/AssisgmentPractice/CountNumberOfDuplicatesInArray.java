package AssisgmentPractice;

public class CountNumberOfDuplicatesInArray {
	public static void main(String[] args) {
		int a[]= { 4,1,1,3,5,6,7,6};
		int count =0 ;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					break;
				}
			}
		}
		System.out.println("Duplicate number are " +count);
	}
}
	
	
