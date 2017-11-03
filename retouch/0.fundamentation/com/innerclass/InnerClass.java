package com.innerclass;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.sound.midi.SysexMessage;

class outerClass1{
	static class innerClass{}    //静态内部类
}
class outerClass2{
	class innerClass{}             // 成员内部类（普通内部类）
}
class outerClass3{
	public void memberFuntion(){
		class innerClass {}         //局部内部类
	}
}
/*匿名内部类
 * class Frame{}
class MyFrame extends Frame{
	public MyFrame{
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				dispose();
				System.exit(0);
				}
			private void dispose() {}
		});		
	}
	private void addWindowListener(WindowAdapter windowAdapter) {}
}

*/

public class InnerClass {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
