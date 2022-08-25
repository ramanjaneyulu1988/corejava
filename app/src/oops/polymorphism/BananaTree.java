package oops.polymorphism;

class Tree
{
	public void leafs()
	{
		System.out.println("Tree leafs");
	}
}

public class BananaTree extends Tree
{
	int a = 10;
	String name = "abc";
	
	public void leafs()
	{
		System.out.println("Banana Tree leafs");
	}
	
	public static void main(String[] args) {
		
		Tree t = new BananaTree(); // Auto upcasting
		
		t.leafs();
	}
}
