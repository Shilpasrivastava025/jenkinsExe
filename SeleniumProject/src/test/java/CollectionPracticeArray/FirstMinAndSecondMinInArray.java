package CollectionPracticeArray;

public class FirstMinAndSecondMinInArray {
	public static void main(String[] args) {
		int[] a= {60,8,56,25,96,0};
		int min= a[0];
		for(int i= 1;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
			System.out.println("first minimum is"+"="+min);
			int secmin= a[1];
			for( int i=1; i<a.length;i++)
			{
				if(a[i]<secmin && a[i]>min)
				{
					secmin=a[i];
				
				}
			}
			System.out.println("second minimum is"+"=" +secmin);
		}
		
}
