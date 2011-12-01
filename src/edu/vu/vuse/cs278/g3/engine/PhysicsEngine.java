package edu.vu.vuse.cs278.g3.engine;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * This class is a singleton wrapper around a QueueExecutor that
 * runs the physics calculations and updates the display. Most
 * of the work will be done on this QueueExecutor.
 * @author syddraf
 *
 */
public class PhysicsEngine {

	/*
	 * Singleton Object
	 */
	
	private static PhysicsEngine instance;
	
	/**
	 * This method returns the singleton PhysicsEngine object.
	 * @return The singleton PhysicsEngine
	 */
	public static PhysicsEngine getInstance() {
		if(instance == null)
			instance = new PhysicsEngine();
		return instance;
	}
	
	/**
	 * Null constructor that is private for the purposes of
	 * implementing a singleton object.
	 */
	private PhysicsEngine () {}
	
	
	
	
	
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
	 * and then suspend and flush the queue.
	 */
	public void disable() {
		this.exec.enabled = false;
		this.exec.interrupt();
		this.exec.queue.clear();
		exec = null;
	}
	
	/**
	 * Adds an item to the queue for the thread to execute.
	 * @param runnable PhysicsAction for the engine to perform
	 */
	public void addtoQueue(Runnable runnable) {
		exec.execute(runnable);
	}
	
	
	/**
	 * This class implemented the Executor interface as a single thread.
	 * The QueueExecutor executes its queue on a single thread in sequence.
	 * This is the equivalent of a thread pool of size 1.
	 * @author Matthew Shea
	 *
	 */
	private class QueueExecutor extends Thread implements Executor {

		boolean enabled = true;
		private BlockingQueue<Runnable> queue = new LinkedBlockingQueue<Runnable>();
		
		@Override
		/**
		 * Executes the runnable queue, blocking when the queue is empty.
		 */
		public void run() {
			
				try {
					while(enabled) {
						Runnable r = this.queue.take();
						r.run();
					}
					this.queue.clear();
				} catch (InterruptedException e) {	}
			
		}
		
		
		/**
		 * This method pushes a new PhysicsAction onto the executor's queue.
		 * @param runnable PhysicsAction to add the the Executor's queue.
		 */
		public void execute(Runnable runnable) {
			this.queue.add(runnable);
			
		}
		
	}
}
