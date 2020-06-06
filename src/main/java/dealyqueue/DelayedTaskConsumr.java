package dealyqueue;

import java.util.concurrent.DelayQueue;

public class DelayedTaskConsumr implements Runnable{
	private DelayQueue<DelayedTask> q;
	public DelayedTaskConsumr(DelayQueue<DelayedTask> q) {
		this.q=q;
	}
	public void run() {
		try {
			while(!Thread.interrupted()) {
				q.take().run();
			}
		}catch(InterruptedException e) {
			
		}
		System.err.println("Finshed DelayTaskConsumr");
	}
}
