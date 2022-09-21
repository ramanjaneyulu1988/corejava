package threads;

public class ThreadExample2 implements Runnable
{

	public static void main(String[] args) {
		
		ThreadExample2 e2 = new ThreadExample2();
		Thread t = new Thread(e2);
		
		t.start();
		
		for(int i=1; i<=10; i++)
		{
			System.out.println("Main method: "+i);
			
			try {
				Thread.sleep(1000L);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public void run() {
		
		for(int i=11; i<=20; i++)
		{
			System.out.println("Run method: "+i);
			
			try {
				Thread.sleep(1000L);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
