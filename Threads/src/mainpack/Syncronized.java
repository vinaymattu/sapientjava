package mainpack;

class data {
	int value;

	public void getValue() {
		System.out.println(value);
	}

	public void setValue(int value) {
		this.value = value;
	}

}

class Runner1 implements Runnable {

	data data;
	private Thread secondThread;

	public Runner1() {
		data = new data();
	}

	public void run() {

		Thread currThread;

		for (int counter = 0; counter < 10; counter++) {
			currThread = Thread.currentThread();

			if (currThread.getName().equals("Producer")) {
				System.out.println(currThread);
				synchronized (data) {
					data.setValue(counter + 1);

					try {
						data.notify();

						if (!secondThread.isAlive()) {
							secondThread.start();
						}

						data.wait(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			} else if (currThread.getName().equals("Consumer")) {
				System.out.println(currThread);
				synchronized (data) {
					data.getValue();

					try {

						data.notify();

						data.wait(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}

			}
		}
	}

	public void setSecondThread(Thread secondThread) {
		this.secondThread = secondThread;

	}

}

public class Syncronized {

	public static void main(String[] args) {

		Runner1 runner = new Runner1();

		Thread firstThread = new Thread(runner, "Producer");
		Thread secondThread = new Thread(runner, "Consumer");

		firstThread.start();
		// secondThread.start();

		// System.out.println(firstThread.getState());

		runner.setSecondThread(secondThread);

		System.out.println("the end");

	}

}
