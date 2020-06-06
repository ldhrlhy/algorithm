package waitnotify;

import java.util.concurrent.TimeUnit;

public class WaxOff implements Runnable {
	private Car car;
	public WaxOff(Car c) {
		car = c;
	}
	public void run() {
		try {
			while(!Thread.interrupted()){
				car.waitForWaxing();
				System.out.println("Wax off");
				TimeUnit.MILLISECONDS.sleep(200);
				car.buffed();
			}
		}catch(InterruptedException e){
			System.out.println("exit via interrupt");
		}
		System.out.println("end wax off task");
	}
}
