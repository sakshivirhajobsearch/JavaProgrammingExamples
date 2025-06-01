package java_15C_collections_programs_queue_interface_73;

//Adding elements in DelayQueue
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

class MyDelayedObject implements Delayed {
	private String name;
	private long time;

	public MyDelayedObject(String name, long delayTime) {
		this.name = name;
		this.time = System.currentTimeMillis() + delayTime;
	}

	@Override
	public long getDelay(TimeUnit unit) {
		long diff = time - System.currentTimeMillis();
		return unit.convert(diff, TimeUnit.MILLISECONDS);
	}

	@Override
	public int compareTo(Delayed o) {
		return Long.compare(this.time, ((MyDelayedObject) o).time);
	}
}

public class Java_07C_DelayQueue_Class {
	public static void main(String args[]) {
		DelayQueue<Delayed> q = new DelayQueue<>();

		// Add a MyDelayedObject with a delay of 2 seconds
		q.add(new MyDelayedObject("Task1", 2000));

		// Printing the size of the queue
		System.out.println("Size of the queue: " + q.size());
	}
}