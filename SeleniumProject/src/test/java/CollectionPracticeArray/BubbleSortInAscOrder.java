package CollectionPracticeArray;

public class BubbleSortInAscOrder {

	public static void main(String[] args) {
		int []a= {8,9,6,3,1,7,4};
		for(int i= 0; i<a.length;i++)
		{
			for(int j= 1; j<a.length;j++) // Used for Iterator
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int k= 0;k<a.length;k++)
		{
			System.out.println(a[k]);
		}

	}

}
