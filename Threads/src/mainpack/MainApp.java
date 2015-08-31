package mainpack;

class runner implements Runnable {

	public void run() {
		System.out.println("inside runner");

		for (int counter = 0; counter < 10; counter++) {
			System.out.println(Thread.currentThread());
		}
	}
}

public class MainApp {

	public static void main(String[] args) {
		// every application in java is single threaded

		runner runner = new runner();
		// Thread MainThread = Thread.currentThread();

		Thread firstThread = new Thread(runner, "first Thread");
		Thread secondThread = new Thread(runner, "second Thread");

		firstThread.start();
		secondThread.start();

		System.out.println(firstThread.getState());
		/*
		 * System.out.println(MainThread); try { Thread.sleep(5000); } catch
		 * (InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */

		try {
			firstThread.join();
			secondThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("the end");

	}

}
