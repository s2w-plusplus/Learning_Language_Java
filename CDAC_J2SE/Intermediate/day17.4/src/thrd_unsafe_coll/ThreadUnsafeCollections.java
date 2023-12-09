package thrd_unsafe_coll;

import java.util.*;

public class ThreadUnsafeCollections {
	public static void main(String[] args) throws Exception {
		List<Integer> list = new ArrayList<>(10000);
		for (int i = 0; i < 10000; i++)
			list.add(i);
			//Thread(Runnable instance,String name)
		//SAM : public void run()
		Thread reader = new Thread(() -> {
			list.forEach(i->{System.out.println(i);
			try {
				Thread.sleep(13);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			});//forEach : for-each : implicit Iterator(fail-fast)
		}, "t1");
		
		Thread writer = new Thread(() -> {
			for (int i = 10000; i < 20000; i++) {
				
				list.add(i);
				try {
					Thread.sleep(17);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}, "t2");
		
		/*	 java.util.ConcurrentModificationException
		 * 
		 * This exception may be thrown by methods that have detected concurrent modification of an object when such modification is not permissible.
		 *	For example, it is not generally permissible for one thread to modify a Collection while another thread is iterating over it.
		 *	Iterators that do this are known as fail-fast iterators, as they fail quickly and cleanly, rather that risking arbitrary,
		 * non-deterministic behavior at an undetermined time in the future.
		 *
		 *	Note that this exception does not always indicate that an object has been concurrently modified by a different thread.
		 *	If a single thread issues a sequence of method invocations that violates the contract of an object, the object may throw this exception.
		 * For example, if a thread modifies a collection directly while it is iterating over the collection with a fail-fast iterator, the iterator will throw this exception
		 * 
		 * */
		reader.start();
		writer.start();
		reader.join();
		writer.join();
		System.out.println("main over...");
	}
}