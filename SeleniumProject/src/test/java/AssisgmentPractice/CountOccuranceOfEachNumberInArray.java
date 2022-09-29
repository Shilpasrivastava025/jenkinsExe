package AssisgmentPractice;

public class CountOccuranceOfEachNumberInArray {

	public static void main(String[] args) {
		int a[]= {4,1,3,5,6,7,6};
		 int b[] = new int [a.length];  
	        int value = -1;  
	        for(int i = 0; i < a.length; i++){  
	            int count = 1;  
	            for(int j = i+1; j < a.length; j++){  
	                if(a[i] == a[j]){  
	                    count++;  
	                   
	                    b[j] = value;   //To avoid counting same element again  
	                }  
	            }  
	            if(b[i] != value)  
	                b[i] = count;  
	        }  
	  
	        //Displays the frequency of each element present in array  
	   
	        for(int i = 0; i < b.length; i++){  
	            if(b[i] != value)  
	                System.out.println("" + a[i] + "->" + b[i]);  
	        }  
	      
	    }
	}

