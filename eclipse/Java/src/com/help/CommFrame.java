package com.help;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.RandomAccessFile;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class CommFrame extends JFrame implements ActionListener{
    File file=null;
    JMenuBar bar;
    JMenu fileMenu;
    JMenuItem inputMenuItem,showMenuItem;
    JTextArea show;
    InputArea inputMessage  ;
    CardLayout card=null;
    JPanel pCenter ;
    CommFrame(){
 	   file=new File("ͨѶ¼.txt");
 	   inputMenuItem=new JMenuItem("¼��");
 	   showMenuItem=new JMenuItem("��ʾ");
 	   bar=new JMenuBar();
 	   fileMenu=new JMenu("�˵�ѡ��");
 	   fileMenu.add(inputMenuItem);
 	   fileMenu.add(showMenuItem);
 	   bar.add(fileMenu);
 	   setJMenuBar(bar);
 	   inputMenuItem.addActionListener(this);
 	   showMenuItem.addActionListener(this);
 	   show=new JTextArea(12,20);
 	   card=new CardLayout();
 	   pCenter=new JPanel();
 	   pCenter.setLayout(card);
 	   pCenter.add("inputMenuItem",inputMessage);
 	   pCenter.add("showMenuItem",show);
 	   add(pCenter,BorderLayout.CENTER);
 	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 	   setVisible(true);
 	   setBounds(100,50,420,380);
 	   validate();
    }
    public void actionPerformed(ActionEvent e){
 	   if(e.getSource()==inputMenuItem)
 		   card.show(pCenter,"inputMenuItem");
 	   else if(e.getSource()==showMenuItem){
 		   int number=1;
 		   show.setText(null);
 		   card.show(pCenter, "showMenuItem");
 		   try{
 			   RandomAccessFile in=new RandomAccessFile(file,"r");
 			   String name=null;
 			   while((name=in.readUTF())!=null){
 				   show.append("\n"+number+" "+name);
 				   show.append("\t "+in.readUTF());
 				   show.append("\t"+in.readUTF());
 				   show.append("\n------------------------");
 				   number++;
 			   }
 			   in.close();
 		   }
 		   catch(Exception ee){}
 	   }
    }
}
