package com_two.xml.jdom;

import java.io.IOException;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class TestDemo {

	public static void main(String[] args) throws JDOMException, IOException {
		System.out.println("1111BEGIN..");
		//构造一个org.jdom.input.SAXBuilder对象
		SAXBuilder sb = new SAXBuilder();
		//构造文档对象doc
		Document doc=sb.build(TestDemo.class.getClassLoader().getResourceAsStream("com_two//xml//jdom//test.xml"));
		//获取根元素HD
		Element root=doc.getRootElement();
		//获取根元素的所有名字为disk的子元素
		List list=root.getChildren("disk");
		//遍历所有disk元素
		for(int i=0;i<list.size();i++){
			//取得第i个disk元素
			Element element=(Element )list.get(i);
			//取得第i个disk元素的属性值，并将其存入字符串变量name中
			String name=element.getAttributeValue("name");
			//取得disk元素的子元素capacity元素的属性值，并将其存入字符串变量capacity中
			String capacity=element.getChildText("capacity");
			//取得disk元素的子元素directories元素的属性值，并将其存入字符串变量directories中
			String directories=element.getChildText("directories");
			//取得disk元素的子元素files的属性值，并将其存入字符串变量files中
			String files=element.getChildText("files");
			
			System.out.println("磁盘信息：");
			System.out.println("分区盘符："+name);
			System.out.println("分区容量："+capacity);
			System.out.println("目录数目："+directories);
			System.out.println("文件数目："+files);
		}
		
	}

}
