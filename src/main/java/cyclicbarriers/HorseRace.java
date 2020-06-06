package cyclicbarriers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class HorseRace {
	static final int FINSH_LINE = 75;
	private List<Horse> horses = new ArrayList<Horse>();
	private ExecutorService exec = Executors.newCachedThreadPool();
	private CyclicBarrier barrier;
	public HorseRace(int nHorse,final int pause) {
		barrier = new CyclicBarrier(nHorse,new Runnable() {
			
			@Override
			public void run() {
				StringBuilder s = new StringBuilder();
				for(int i = 0;i<FINSH_LINE;i++) {
					s.append("=");
				}
				System.err.println(s);
				for(Horse horse:horses) {
					System.err.println(horse.tracks());
				}
				for(Horse horse:horses) {
					if(horse.getStrides()>=FINSH_LINE) {
						System.out.println(horse+"won");
						exec.shutdownNow();
						return;
					}
				}
				try {
					TimeUnit.MILLISECONDS.sleep(pause);
				}catch(InterruptedException e) {
					
				}
			}
		});
		for(int i=0;i<nHorse;i++) {
			Horse horse = new Horse(barrier);
			horses.add(horse);
			exec.execute(horse);
		}
	}
	public static void main(String[] args) {
		int nHorse = 7;
		int pause = 200;
		if(args.length>0) {
			int n =new Integer(args[0]);
			nHorse = n>0?n:nHorse;
		}
		if(args.length>1) {
			int p  = new Integer(args[1]);
			pause = p>-1?p:pause;
		}
		new HorseRace(nHorse, pause);
	}
}
