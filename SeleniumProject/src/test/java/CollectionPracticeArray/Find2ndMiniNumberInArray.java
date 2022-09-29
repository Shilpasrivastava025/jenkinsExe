package CollectionPracticeArray;

public class Find2ndMiniNumberInArray {

	public static void main(String[] args) {
		int a[]= { 56,3,9,25,12,49};
		for(int i=0; i<a.length;i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if (a[i]<a[j])
				{
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(a[1]); // 2nd minimum number in Array
	}

}
