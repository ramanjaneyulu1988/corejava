package collectionfw.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class WaysToIterateSet {

	public static void main(String[] args) {
		
		Set set = new HashSet();
		
		set.add("abc");
		set.add("xyz");
		set.add("aaa");
		set.add("bbb");
		set.add("abc");
		set.add("xyz");
		
		System.out.println(set);
		
		System.out.println("Using Enhanced for loop..................");
		for(Object data : set)
		{
			System.out.println(data);
		}
		
		System.out.println("Uisng iterator................");
		Iterator it = set.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
