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
 * 

class MyFrame extends Frame{		//外部类
	public MyFrame{
		addWindowListener(new WindowAdapter(){		//匿名内部类WindowAdapter
			public void windowClosing(WindowEvent e){
				dispose();
				System.exit(0);
				}
			private void dispose() {}
		});		
}

*/
