package PrepareTest.test11_QueueTest;

import java.util.LinkedList;
import java.util.Queue;

public class Testdemo {
	public void showQueue(Queue<Command> queue){
		while(queue.peek() != null){
			Command c = queue.remove();
			c.operation();
		}
	}

}
