package com.innerclass;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.sound.midi.SysexMessage;

class outerClass1{
	static class innerClass{}    //��̬�ڲ���
}
class outerClass2{
	class innerClass{}             // ��Ա�ڲ��ࣨ��ͨ�ڲ��ࣩ
}
class outerClass3{
	public void memberFuntion(){
		class innerClass {}         //�ֲ��ڲ���
	}
}
/*�����ڲ���
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
		// TODO �Զ����ɵķ������

	}

}
