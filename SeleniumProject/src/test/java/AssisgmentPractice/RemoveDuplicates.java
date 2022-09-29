package AssisgmentPractice;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int []a= {4,1,1,3,5,6,7,6};
		for(int i = 0; i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int []t= new int[a.length];
		int j=0;
		for(int i =0;i<a.length-1;i++)
		{
			if(a[i]!= a[i+1])
              {
				t[j]=a[i];
				j++;
              }
			t[j]=a[a.length-1];
		}
			for(int k=0;k<t.length;k++)
			{
				System.out.print(t[k]+" ");
			}
		}
	}
