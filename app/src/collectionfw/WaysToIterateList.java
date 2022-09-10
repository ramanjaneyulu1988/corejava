package collectionfw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class WaysToIterateList {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add("abc");
		list.add("xyz");
		list.add("aaa");
		list.add("abc");
		list.add("xyz");
		list.add("xyz");
		list.add("xyz");
		
		// Using normal for loop
		System.out.println("Using normal for loop ---------------");
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		
		System.out.println("Using Enhanced for loop ---------------");
		for(Object s : list)
		{
			System.out.println(s);
		}
		
		System.out.println("Using iterator --------------------");
		Iterator it = list.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("Using list iterator ------------------------");
		ListIterator lit = list.listIterator();
		
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
	}
}
