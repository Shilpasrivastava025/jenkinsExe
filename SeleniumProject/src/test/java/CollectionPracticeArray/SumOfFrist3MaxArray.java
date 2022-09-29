package CollectionPracticeArray;

public class SumOfFrist3MaxArray {
		public static void main(String[] args) {
			int[] a = {6,9,5,2,9,3};
			int sum= 0;
			int count=3;
			for(int i=0;i<a.length;i++) // fetch the element one by one
			{
				for (int j=i+1;j<a.length;j++) // Iterating  element one after another
				{
					if(a[i]<a[j])
					{
						int temp = a[i];
						a[i]=a[j];
						a[j]=temp; // 9 7 6 5 3 2
					}
				}
			}
			for (int i =0; i<count; i++)
			{
				sum =sum+a[i];
				
			}
			System.out.println(sum);
		}
}
