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
 * 

class MyFrame extends Frame{		//�ⲿ��
	public MyFrame{
		addWindowListener(new WindowAdapter(){		//�����ڲ���WindowAdapter
			public void windowClosing(WindowEvent e){
				dispose();
				System.exit(0);
				}
			private void dispose() {}
		});		
}

*/
