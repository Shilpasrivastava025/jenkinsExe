package CollectionPracticeArray;

import java.util.ArrayList;

public class Collection {
	public static void main(String[] args) {
		
		ArrayList<Object> list = new ArrayList<Object> ();
		list.add("hi");
		list.add(10);
		list.add('A');
		list.add(10);
		list.add(null);
		System.out.println(list);
	//	list.add(10,"abc");
		list.add("Hello");
		
      System.out.println(list);		
   
    ArrayList<Object> list2 = new ArrayList<Object> ();
    list2.add("abc");
    list2.addAll(list);
    System.out.println(list2);

	}

}
