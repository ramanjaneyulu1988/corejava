package threads;

public class ThreadLifeCycleExample1 extends Thread
{
	public static void main(String[] args) {
		
		ThreadLifeCycleExample1 e1 = new ThreadLifeCycleExample1();
		System.out.println(e1.getState());
		
		e1.start();
		System.out.println(e1.getState());
		
		
//		New, Runnable, Terminated
//		If any blocking is there then Thread state will be Blocked
		
	}
}
