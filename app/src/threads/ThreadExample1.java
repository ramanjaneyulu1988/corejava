package threads;

public class ThreadExample1 extends Thread
{
	public static void main(String[] args) throws InterruptedException {
		
		ThreadExample1 e1 = new ThreadExample1();
		e1.start();
		
		for(int i=1; i<=10; i++)
		{
			System.out.println("Main Thread: "+i);
			
			Thread.sleep(1000L);
		}
		
		System.out.println("Parent Thread completed...");
	}
	
	public void run()
	{
		for(int i=11; i<=40; i++)
		{
			System.out.println("Thread: "+i);
			
			try {
				Thread.sleep(1000L);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
