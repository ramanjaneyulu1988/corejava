package oops.inheritance;

public class HondaCar extends Car
{
	public static void main(String[] args) {
		
		HondaCar hondaCar = new HondaCar();
		
		hondaCar.wheels();
		hondaCar.dors();
	}
	
	public void wheels()
	{
		System.out.println("Hondacar wheels");
	}
}
