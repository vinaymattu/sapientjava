package mainpack;

public class NewThread implements Runnable{

	public void run()
	{
		for(int i=0;i<10;i++)
		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(i);
		}
	}
	
	
	public static void main(String[] args) {
	
	NewThread thread=new NewThread();
	
	Thread t=new Thread(thread,"first thread");
	Thread t1=new Thread(thread,"second thread");
	Thread t2=new Thread(thread,"third thread");
      t.start();
      
      System.out.println(t.getName()+" "+t1.getName()+" "+t2.getName());
      
      System.out.println(t.getId()+" "+t1.getId()+" "+t2.getId());
      
      try {
		t.join();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
      t1.start();
      t2.start();
	}

}
