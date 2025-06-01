package java_15C_collections_programs_queue_interface_73;

//Removing elements in DelayQueue
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class Java_07D_DelayQueue_Class {

	public static void main(String args[]) {

		// Create a DelayQueue instance
		DelayQueue<Delayed> q = new DelayQueue<Delayed>();

		// Create an object of type Delayed
		Delayed ob = new Delayed() {
			public long getDelay(TimeUnit unit) {
				return 24; // some value is returned
			}

			public int compareTo(Delayed o) {
				if (o.getDelay(TimeUnit.DAYS) > this.getDelay(TimeUnit.DAYS))
					return 1;
				else if (o.getDelay(TimeUnit.DAYS) == this.getDelay(TimeUnit.DAYS))
					return 0;
				return -1;
			}
		};

		// Add the object to DelayQueue
		q.add(ob);

		// Print initial size of Queue
		System.out.println("Initial Size of DelayQueue : " + q.size());

		// Remove the object ob from
		// this DelayQueue
		q.remove(ob);

		// Print the final size of the DelayQueue
		System.out.println("Size after removal : " + q.size());
	}
}
