package collectionfw.set;

import java.util.HashSet;
import java.util.Set;

public class SetExample1 {

	public static void main(String[] args) {
		
		Set set = new HashSet(); // auto upcasting

		set.add("abc");
		set.add("xyz");
		set.add("aaa");
		set.add("bbb");
		set.add("abc");
		
		System.out.println(set);
		System.out.println(set.size()); // 4
		
		set.remove("abc");
		System.out.println(set);
		
//		set.clear();
//		System.out.println(set); // []
		
		System.out.println(set.size()); // 3
		
		boolean b = set.contains("abc");
		System.out.println(b); // false
	}
}
