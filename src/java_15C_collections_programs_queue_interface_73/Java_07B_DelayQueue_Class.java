package java_15C_collections_programs_queue_interface_73;

import java.util.concurrent.BlockingQueue;
//Java program to demonstrates 
//how DelayQueue holds elements
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

//The DelayObject for DelayQueue
//It must implement Delayed and
//its getDelay() and compareTo() method
class DelayObject implements Delayed {

	private String name;
	private long time;

	// Constructor of DelayObject
	public DelayObject(String name, long delayTime) {
		this.name = name;
		this.time = System.currentTimeMillis() + delayTime;
	}

	// Implementing getDelay() method of Delayed
	@Override
	public long getDelay(TimeUnit unit) {
		long diff = time - System.currentTimeMillis();
		return unit.convert(diff, TimeUnit.MILLISECONDS);
	}

	// Implementing compareTo() method of Delayed
	@Override
	public int compareTo(Delayed obj) {
		if (this.time < ((DelayObject) obj).time) {
			return -1;
		}
		if (this.time > ((DelayObject) obj).time) {
			return 1;
		}
		return 0;
	}

	// Implementing toString() method of Delayed
	@Override
	public String toString() {
		return "{name=" + name + ", time=" + time + "}";
	}
}

//Driver Class
public class Java_07B_DelayQueue_Class {

	public static void main(String[] args) throws InterruptedException {

		// Create object of DelayQueue
		// using DelayQueue() constructor
		BlockingQueue<DelayObject> d = new DelayQueue<DelayObject>();

		// Add numbers to the end of DelayQueue
		// with different delays
		d.add(new DelayObject("A", 1000));
		d.add(new DelayObject("B", 2000));
		d.add(new DelayObject("C", 3000));
		d.add(new DelayObject("D", 4000));

		// Print DelayQueue (before delays have expired)
		System.out.println("Initial DelayQueue: " + d);

		// Polling and taking elements after their delay has expired
		// Poll until queue is empty, with a timeout of 1 second
		while (!d.isEmpty()) {

			// Take will block until an element's delay expires

			// This will block until an element becomes available
			DelayObject obj = d.take();
			System.out.println("Taken from DelayQueue: " + obj);
		}
	}
}
