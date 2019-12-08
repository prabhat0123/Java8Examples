package DoubleColonOperator;

public class DoubleMethodRefColonThread {
	
	public static void main(String[] args) {
		
		 
		System.out.println("Main thread method ");
		Runnable r = DoubleMethodRefColonThread::run;
		Thread t = new Thread(r);
		t.start();
		
	}

	
	static void run () {
		for (int i=0;i<10;i++)
		System.out.println("Instance method "+i);
	}
}
