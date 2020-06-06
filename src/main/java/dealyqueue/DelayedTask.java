package dealyqueue;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class DelayedTask implements Runnable, Delayed {
	private static int counter = 0;
	private final int id = counter++;
	private final int delta;
	private final long trigger;
	protected static List<DelayedTask> sequece = new ArrayList<DelayedTask>();

	public DelayedTask(int delayInMilliseconds) {
		delta = delayInMilliseconds;
		trigger = System.nanoTime() + TimeUnit.NANOSECONDS.convert(delta,TimeUnit.MILLISECONDS);
		sequece.add(this);
	}
	public long getDelay(TimeUnit unit) {
		return unit.convert(trigger-System.nanoTime(), TimeUnit.NANOSECONDS);
	}
	public int compareTo(Delayed arg) {
		DelayedTask that = (DelayedTask)arg;
		if(trigger<that.trigger) return -1;
		if(trigger>that.trigger) return 1;
		return 0;
	}
	
	public void run() {
		System.err.println(this+" ");
	}
	public String toString() {
		return String.format("[%1$-4d]", delta)+"Task"+id;
	}
	public String summary() {
		return "(" + id + ":"+ delta + ")";
	}
	public static class EndSentinel extends DelayedTask{
		private ExecutorService exec;
		public EndSentinel(int delay,ExecutorService e) {
			super(delay);
			exec=e;
		}
		public void run() {
			for(DelayedTask pt:sequece) {
				System.err.println(pt.summary());
			}
			System.err.println(this+"Calling shutdownNow()");
			exec.shutdownNow();
		}
	}
}
