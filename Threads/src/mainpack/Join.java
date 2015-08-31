package mainpack;

class runner implements Runnable {

	public void run() {
		System.out.println("inside runner");
		
		for(int counter=0;counter<10;counter++)
		{
			System.out.println(Thread.currentThread());
		}
	}
}

public class Join {

	public static void main(String[] args) {
	

		runner runner = new runner();
	

		Thread firstThread = new Thread(runner, "first Thread");
		Thread secondThread = new Thread(runner, "second Thread");
		
		firstThread.start();
		secondThread.start();
		
		System.out.println(firstThread.getState());
	
		try {
			firstThread.join();
			secondThread.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}

		System.out.println("the end");

	}

}
