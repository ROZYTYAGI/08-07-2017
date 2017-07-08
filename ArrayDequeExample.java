package generic;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
	public static void main(String a[])
	{
		Deque<String> deque=new ArrayDeque<String>();
		deque.add("a");
		deque.add("b");
		deque.add("c");
		deque.add("d");
	for(String str:deque)
	{
		System.out.println(str);
		
	}
	deque.peek();
	System.out.println(deque);
	deque.pop();
	System.out.println(deque);
	deque.poll();
	System.out.println(deque);
	deque.offer("bcd");
	System.out.println(deque);
	deque.offerFirst("bcdeffgg");
	System.out.println(deque);
	deque.offerLast("bcdbbgf");
	System.out.println(deque);
	}

}
