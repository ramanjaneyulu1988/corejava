package threads;

class Table
{
	public synchronized void printTable(int n)
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(Thread.currentThread().getName()+" : "+n*i);
			try 
			{
				Thread.sleep(1000);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}

class Thread1 extends Thread
{
	Table t;

	public Thread1(Table t)
	{
		this.t = t;
	}

	public void run()
	{
		t.printTable(2);
	}
}

class Thread2 extends Thread
{
	Table t;

	public Thread2(Table t)
	{
		this.t = t;
	}

	public void run()
	{
		t.printTable(10);
	}
}

class Thread3 extends Thread
{
	Table t;

	public Thread3(Table t)
	{
		this.t = t;
	}

	public void run()
	{
		t.printTable(20);
	}
}

public class SynchronisationExample1
{
	public static void main(String[] args) {
		
		Table t = new Table();
		
		Thread1 t1 = new Thread1(t);
		Thread2 t2 = new Thread2(t);
		Thread3 t3 = new Thread3(t);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
