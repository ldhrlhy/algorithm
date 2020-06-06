package countdownlatch;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class TaskPortion implements Runnable{
	private static int counter=0;
	private final int id = counter++;
	public static Random rand = new Random(47);
	private final CountDownLatch latch;
	TaskPortion(CountDownLatch latch){
		this.latch = latch;
	}
	public void run() {
		try {
			doWork();
			latch.countDown();
		}catch (InterruptedException e) {
			
		}
	}
	public void doWork() throws InterruptedException{
		// TODO Auto-generated method stub
		TimeUnit.MICROSECONDS.sleep(rand.nextInt(2000));
		System.out.println(this+"complete");
	}
	public String toString() {
		return String.format("%1$-3d", id);
	}
}
