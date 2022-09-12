package collectionfw.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashtableExample1 {

	public static void main(String[] args) {

		Map map = new Hashtable();

		map.put(1,"abc");
		map.put(2,"aaa");
		map.put(3,"bbb");
		map.put(7, "uuu");
		map.put(4,"ccc");
		map.put(5,"xyz");
		map.put(5,"ddd");
		map.put(6,"abc");

		System.out.println(map);
	}
}
