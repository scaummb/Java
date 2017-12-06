package PrepareTest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class test10_QueueDemo {
	public static void printQ(Queue queue){
		while(queue.peek() != null){
//			System.out.print(queue.remove());
			System.out.print(queue.poll());
		}
		System.out.println();
	}
	public static void main(String[] args) {
		//不能实例化类型 Queue<Integer>
//		Queue<Integer> queue = new Queue<Integer>();
		Queue<Integer> queue = new LinkedList<Integer>();
		Random rand = new Random(80);
		for(int i = 0; i < 10; i++){
			queue.offer(rand.nextInt(i + 10));
		}
		printQ(queue);
		Queue<Character> qc = new LinkedList<Character>();
		for(char c : "Brontosaurus".toCharArray()){
			qc.offer(c);
		}
		printQ(qc);
	}

}
