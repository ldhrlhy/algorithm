package waitnotify;

import java.util.concurrent.TimeUnit;

public class WaxOn implements Runnable{
	private Car car;
	public WaxOn(Car c) {
		car = c;
	}
	public void run() {
		try {
			while(!Thread.interrupted()){
				System.out.println("Wax on");
				TimeUnit.MILLISECONDS.sleep(200);
				car.waxed();
				car.waitForBuffing();
			}
		}catch(InterruptedException e){
			System.out.println("exit via interrupt");
		}
		System.out.println("end wax");
	}
}
