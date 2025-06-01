package java_15C_collections_programs_queue_interface_73;

//Accessing elements in DelayQueue
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

	// Implementing toString() method of Delayed
	@Override
	public String toString() {
		return "\n{" + name + ", time=" + time + "}";
	}
}

//Driver Class
public class Java_07E_DelayQueue_Class {

	public static void main(String[] args) throws InterruptedException {

		// create object of DelayQueue
		// using DelayQueue() constructor
		BlockingQueue<DelayObject> d = new DelayQueue<DelayObject>();

		// Add numbers to end of DelayQueue
		// using add() method
		d.add(new DelayObject("A", 1000));
		d.add(new DelayObject("B", 2000));

		// Print DelayQueue
		System.out.println("Original DelayQueue: " + d);

		// peek() method for returning head of the
		// DelayQueue
		System.out.println("Head of the DelayQueue: " + d.peek());
	}
}
