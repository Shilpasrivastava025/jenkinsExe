package PartternPrograms;

public class TrianglePattern {
	public static void main(String[] args) {
		int n=5;
		for(int i=1; i<=n;i++)
		{
		for(int j=i;j<=n;j++) // decreasing Pattern
		{
			System.out.print("  "); // space 
		}
		 for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}

		for(int j=1;j<i;j++) // increasing pattern
		{
			System.out.print("* ");
		}
		System.out.println();
}
	}
}
