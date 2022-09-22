package threads;

class Table_1
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

class Thread1_1 implements Runnable
{
	Table t;

	public Thread1_1(Table t)
	{
		this.t = t;
	}

	public void run()
	{
		t.printTable(2);
	}
}

class Thread2_1 implements Runnable
{
	Table t;

	public Thread2_1(Table t)
	{
		this.t = t;
	}

	public void run()
	{
		t.printTable(10);
	}
}

class Thread3_1 implements Runnable
{
	Table t;

	public Thread3_1(Table t)
	{
		this.t = t;
	}

	public void run()
	{
		t.printTable(20);
	}
}

public class SynchronisationExample2
{
	public static void main(String[] args) {
		
		Table t = new Table();
		
		Thread1_1 t1_1 = new Thread1_1(t);
		Thread2_1 t2_1 = new Thread2_1(t);
		Thread3_1 t3_1 = new Thread3_1(t);
		
		Thread t1 = new Thread(t1_1);
		Thread t2 = new Thread(t2_1);
		Thread t3 = new Thread(t3_1);
		
		t1.start();
		t2.start();
		t3.start();
	}
}

