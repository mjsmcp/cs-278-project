package edu.vu.vuse.cs278.g3.engine;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

public class PhysicsEngine {

	QueueExecutor exec = new QueueExecutor();
	
	/**
	 * This method will allow the engine to perform operations in its
	 * run queue.
	 */
	public void enable() {
		if(exec != null && exec.isAlive()) exec.interrupt();
		exec = new QueueExecutor();
		exec.start();
	}
	
	/**
	 * Calling this method will allow the engine to finish it's current operation,
	 * and then suspend.
	 */
	public void disable() {
		this.exec.enabled = false;
		this.exec.interrupt();
		exec = null;
	}
	
	/**
	 * Adds an item to the queue for the thread to execute.
	 * @param runnable
	 */
	public void addtoQueue(Runnable runnable) {
		exec.execute(runnable);
	}
	
	private class QueueExecutor extends Thread implements Executor {

		boolean enabled = true;
		private BlockingQueue<Runnable> queue = new LinkedBlockingQueue<Runnable>();
		@Override
		public void run() {
			
				try {
					while(enabled) {
						Runnable r = this.queue.take();
						r.run();
					}
				} catch (InterruptedException e) {	}
			
		}
		@Override
		public void execute(Runnable runnable) {
			this.queue.add(runnable);
			
		}
		
	}
}
