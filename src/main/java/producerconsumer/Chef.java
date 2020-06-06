package producerconsumer;

import java.util.concurrent.TimeUnit;

public class Chef implements Runnable{
	private Restaurant restaurant;
	private int count = 0;
	public Chef(Restaurant r) {
		restaurant = r;
	}
	public void run() {
		try {
			while (!Thread.interrupted()) {
				synchronized (this) {
					while (restaurant.meal!=null) {
						wait();
					}
				}
				if(++count==10) {
					System.err.println("out of food");
					restaurant.exec.shutdownNow();
				}
				System.err.println("orderUp");
				synchronized (restaurant.waitPerson) {
					restaurant.meal = new Meal(count);
					restaurant.waitPerson.notifyAll();
				}
				TimeUnit.MILLISECONDS.sleep(10);
			}
		}catch (InterruptedException e) {
			System.err.println("chef interrupted");
		}
	}
}
