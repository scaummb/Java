package PrepareTest.test11_QueueTest;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test {

	public static void main(String[] args) {
		Queue<Command> list = new LinkedList<Command>();
		list.add(new Command("mmb1")) ;
		list.add(new Command("mmb2")) ;
		list.add(new Command("mmb3")) ;
		list.add(new Command("mmb4")) ;
		for(Command c : list){
			System.out.println("Insert: "+c.getString());
		}
		
		System.out.println("------------------");
		
		//建立了两个对象，用内置方法完成了显示每一个Command对象的string
		Command_Queue cq = new Command_Queue();
		Testdemo t = new Testdemo();
		cq.setQueue(list);
		t.showQueue(cq.getQueue());	
		
		
	}

}
