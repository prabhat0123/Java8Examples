package UseRunable;

public class UseRunable {
	
	public static void main(String[] args) {
	Runnable r = () ->{
		for(int i=0;i<10; i++ )
			System.out.println("It is child thread "+i);
			
	};
	
	System.out.println("It is main Thread ");
	Thread t = new Thread(r);
	t.start();
	
	}

}



