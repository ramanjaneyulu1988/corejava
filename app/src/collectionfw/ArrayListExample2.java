package collectionfw;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample2 {

	public static void main(String[] args) {

		List cities1 = new ArrayList();

		cities1.add("ATP");
		cities1.add("Hyd");
		cities1.add("Kurnool");
		cities1.add("Tirupati");
		cities1.add("Vizag");
		
		System.out.println(cities1);

		List cities2 = new ArrayList();

		cities2.add("Blr");
		cities2.add("Hubli");
		cities2.add("Bellary");
		cities2.add("Gadag");
		cities2.add("Gokarna");
		
		System.out.println(cities2);
		
		cities1.addAll(cities2);
		System.out.println(cities1);
		
//		cities1.removeAll(cities2);
//		System.out.println(cities1);
		
		cities1.retainAll(cities2);
		System.out.println(cities1);
	}
}
