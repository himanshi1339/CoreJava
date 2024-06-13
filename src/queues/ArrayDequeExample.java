package queues;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeExample {
public static void main(String[] args) {
	ArrayDeque q = new ArrayDeque();
	q.offer(4);
	q.offer(1);
	q.offer(3);
	q.offerLast(5);
	q.offerFirst(2);
	
	System.out.println(q);
	
	//peaklast() get last element
	System.out.println(q.peek() + "get top element");
	System.out.println(q);
	
	//polllast() get and remove last element
	System.out.println(q.poll() + "get top element and remove");
	System.out.println(q);
	
	//q.forEach(system.out::println);
	
	Iterator it = q.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
}
}
