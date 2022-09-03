package string;

public class Example2 {

	public static void main(String[] args) {
		
		String cities = "Hyderabad#Bangalore#Chennai#Vizag#Hubli#Mumbai#Pune#Bellary";
		
		String cs[] = cities.split("#");
		
//		System.out.println(cs[0]); // Hyderabad
//		System.out.println(cs[3]); // Vizag
		
		for(int i=0; i<cs.length; i++)
		{
			System.out.println(cs[i]);
			
//			if(cs[i].endsWith("e"))
//			{
//				System.out.println(cs[i]);
//			}
//			
//			if(cs[i].startsWith("H"))
//			{
//				System.out.println(cs[i]);
//			}
		}
	}
}
