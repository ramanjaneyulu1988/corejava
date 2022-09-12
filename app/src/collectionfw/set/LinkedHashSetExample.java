package collectionfw.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		
		Set<String> set = new LinkedHashSet<>(); // auto upcasting
		
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
	}
}
