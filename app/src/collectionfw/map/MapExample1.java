package collectionfw.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample1 {

	public static void main(String[] args) {
		
		Map map = new HashMap();
		
		map.put(1,"abc");
		map.put(2,"aaa");
		map.put(3,"bbb");
		map.put(4,"ccc");
		map.put(5,"xyz");
		map.put(5,"ddd");
		map.put(6,"abc");
		
		System.out.println(map);
		
	}
}
