import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Timer implements Runnable{
	Thread  thread;
	ActionListener al;
	float delay;
	boolean running = false;
	
	public Timer(float delay, ActionListener al) {
		this.al = al;
		thread = new Thread(this);
		this.delay = delay;
	}
	
	public void start() {
		running = true;
	}
	
	public void stop() {
		running = false;

	}
	
	@Override
	public void run() {
		long startTime = System.currentTimeMillis();
		while(running) {
			if(System.currentTimeMillis() - startTime >= delay) {
				al.actionPerformed(new ActionEvent(this, 0, "timer"));
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				startTime = System.currentTimeMillis();
			}
		}
		
	}
}
