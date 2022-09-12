package collectionfw.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();

		map.put(1,"abc");
		map.put(2,"aaa");
		map.put(3,"bbb");
		map.put(7, "uuu");
		map.put(4,"ccc");
		map.put(5,"xyz");
		map.put(5,"ddd");
		map.put(6,"abc");

		System.out.println(map);
		
		map.remove(7);
		System.out.println(map);
		
//		map.clear();
//		System.out.println(map);
		
		boolean b = map.isEmpty();
		System.out.println(b);
		
		System.out.println(map.get(7));
	}
}

