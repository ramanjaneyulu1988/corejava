package collectionfw.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {

		Set set = new HashSet(); // auto upcasting

		set.add("abc");
		set.add("xyz");
		set.add("aaa");
		set.add("bbb");
		set.add("abc");
		set.add("xyz");
		set.add("xyz");
		set.add("xyz");
		set.add("xyz");
		set.add("xyz");
		set.add("xyz");
		set.add("xyz");

		System.out.println(set);
		
		List list = new ArrayList(set);
		System.out.println(list);
	}
}
