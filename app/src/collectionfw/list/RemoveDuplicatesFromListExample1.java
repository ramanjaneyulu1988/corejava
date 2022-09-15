package collectionfw.list;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromListExample1 {

	public static void main(String[] args) {
		
		List cities = new ArrayList();

		cities.add("ATP");
		cities.add("Hyd");
		cities.add("Kurnool");
		cities.add("Tirupati");
		cities.add("Vizag");
		cities.add("ATP");
		cities.add("Kurnool");
		
		System.out.println(cities);
		
		Set set = new LinkedHashSet(cities);
		
		System.out.println(set);
	}
}
