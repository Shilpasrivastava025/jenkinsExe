package CollectionPracticeArray;

public class Find1stMiniNumberInArray {

	public static void main(String[] args) {
		int a[]= {3,2,9,5,7,1,2};
		for(int i= 0; i<a.length;i++)
		{
			for(int j=i+1; j<a.length;j++)
			{
				if (a[i]>a[j])
					{
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
					}
			}
		}
		System.out.println(a[0]); // 1stminimum number
		System.out.println(a[a.length-1]); //last minimum number
	}

}
