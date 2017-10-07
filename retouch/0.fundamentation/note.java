package com.java.myself;
/*
注释的作用：
	A:解释说明程序，提高程序的阅读性
	B:可以帮助我们调试程序
*/
public class note {
	public static void main(String[] arg) {
		System.out.println("HelloWorld");		
		KeyWord key = new KeyWord();
		Name name = new Name();
		
		key.outputWord();
		
		name.return_allow = true;
		if (name.return_allow == true){
			String c = name.return_Name("tomorrow ");
			System.out.println(c);			
		}			
	}
}

/*
关键字：被Java语言赋予特定含义的单词

关键字的特点：关键字都是小写的

关键字注意事项
	A:goto和const作为保留字存在,目前并不使用
	B:类似Editplus这样的高级记事本,针对关键字有特殊的颜色标记，非常直观
*/
class KeyWord {
	public static void outputWord(){
		System.out.println("static"+" public "+"class"+"methon"+"private"
				+"string int float long double boolean char short '\n'");
	}
}
/*
标识符：就是给类,接口,方法,变量等起名字时使用的字符序列(字符串)

组成规则：
	A:英文字母大小写
	B:数字
	C:_和$

注意事项：
	A:不能以数字开头
	B:不能是Java中的关键字
	C:区分大小写
		Student,student 这是两个名称

常见的命名规则：见名知意
	A:包 其实就是文件夹,用于解决相同类名问题
		全部小写
		单级：com
		多级：cn.itcast

	B:类或者接口
		一个单词：首字母大写
			Student,Person,Teacher
		多个单词：每个单词的首字母大写
			HelloWorld,MyName,NameDemo

	C:方法或者变量
		一个单词：全部小写
			name,age,show()
		多个单词：从第二个单词开始，每个单词首字母大写
			myName,showAllStudentNames()

	D:常量
		一个单词：全部大写
			AGE
		多个单词：每个单词都大写，用_连接
			STUDENT_MAX_AGE
*/
class  Name {
	boolean return_allow = false;
	public static String return_Name(String a){
		String b = a + "will be better.";
		return b;
	}
}
