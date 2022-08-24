package app;

public class C {

//	public static void main(String[] args) {
//		System.out.println("main");
//	}
	
//	static public void main(String[] args) {
//		System.out.println("main");
//	}
	
//	static public void main(String args[]) {
//		System.out.println("main");
//	}
	
//	static public void main(String ram[]) {
//		System.out.println("main");
//	}
	
	static public void main(String... ram) {
		System.out.println("main1");
		
		main(123);
	}
	
	static public void main(String ram) {
		System.out.println("main2");
	}
	
	static public void main(int ram) {
		System.out.println("main3");
	}
}
