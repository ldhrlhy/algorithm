package countdownlatch;

import java.util.concurrent.CountDownLatch;

public class WaitingTask implements Runnable {
	private static int counter = 0;
	private final int id = counter++;
	private final CountDownLatch latch;

	WaitingTask(CountDownLatch latch) {
		this.latch = latch;
	}

	public void run() {
		try {
			latch.await();
			System.out.println("Latch barrier passed for" + this);
		} catch (InterruptedException e) {
			System.out.println(this + "interrupted");

		}
	}
	
	public String toString() {
		return String.format("WaitingTask %1$-3d", id);
	}
}
