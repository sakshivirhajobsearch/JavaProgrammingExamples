package java_15C_collections_programs_queue_interface_73;

//Java Program Demonstrate DelayQueue methods
import java.util.concurrent.BlockingQueue;
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

	// Implementing toString()
	// method of Delayed
	@Override
	public String toString() {
		return "\n{" + "name=" + name + ", time=" + time + "}";
	}
}

//Driver Class
public class Java_07G_DelayQueue_Class {

	public static void main(String[] args) throws InterruptedException {

		// create object of DelayQueue
		// using DelayQueue() constructor
		BlockingQueue<DelayObject> d = new DelayQueue<DelayObject>();

		// Add numbers to end of DelayQueue
		// using add() method
		d.add(new DelayObject("A", 1));
		d.add(new DelayObject("B", 2));
		d.add(new DelayObject("C", 3));
		d.add(new DelayObject("D", 4));

		// print queue
		System.out.println("DelayQueue: " + d);

		// print the head using peek() method
		System.out.println("Head of DelayQueue: " + d.peek());

		// print the size using size() method
		System.out.println("Size of DelayQueue: " + d.size());

		// remove the head using poll() method
		System.out.println("Head of DelayQueue: " + d.poll());

		// print the size using size() method
		System.out.println("Size of DelayQueue: " + d.size());

		// clear the DelayQueue using clear() method
		d.clear();
		System.out.println("Size of DelayQueue" + " after clear: " + d.size());
	}
}
