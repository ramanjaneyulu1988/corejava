package collectionfw.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListExample1 {

	public static void main(String[] args) {
		
//		ArrayList list = new ArrayList(); 
		
		List list = new ArrayList();// auto upcasting
		
		list.add("abc");
		list.add("xyz");
		list.add("aaa");
		list.add("abc");
		list.add("xyz");
		list.add("xyz");
		list.add("xyz");
		list.add(123);
		
		System.out.println(list);
		
		System.out.println(list.size());
		
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		
		list.remove("xyz");
		System.out.println(list);
		
		list.add(0, "Alex");
		System.out.println(list);
		
		System.out.println(list.contains("xyz"));
		
//		list.clear();
		System.out.println(list);
		System.out.println(list.size());
		
		System.out.println(list.isEmpty());
		
	}
}
