package PrepareTest.test11_QueueTest;

import java.util.LinkedList;
import java.util.Queue;

public class Command_Queue{
	private Queue<Command> queue = new LinkedList<Command>();
	//Construction
	public Command_Queue(){
	}
	public Command_Queue(Command command){
		this.queue.offer(command);
	}
	//Get/set
	public Queue<Command> getQueue() {
		return queue;
	}
	public void setQueue(Queue<Command> queue) {
		this.queue = queue;
	}
	
}
