package java_15C_collections_programs_queue_interface_73;

import java.util.Iterator;
//Iterating elements in DelayQueue
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

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
		return "\n{" + name + ", time=" + time + "}";
	}
}

public class Java_07F_DelayQueue_Class {

	public static void main(String[] args) throws InterruptedException {

		// create object of DelayQueue
		BlockingQueue<DelayObject> d = new DelayQueue<DelayObject>();

		// Add numbers to end of DelayQueue
		d.add(new DelayObject("A", 1));
		d.add(new DelayObject("B", 2));
		d.add(new DelayObject("C", 3));
		d.add(new DelayObject("D", 4));

		// Creating an iterator
		Iterator<DelayObject> i = d.iterator();

		// Print the value after iterating over DelayQueue
		System.out.println("The iterator values are: ");
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}