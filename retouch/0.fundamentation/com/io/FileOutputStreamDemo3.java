package com.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * FileOutputStrema写数据的异常处理
 */
public class FileOutputStreamDemo3 {

	public static void main(String[] args) {
		makefile();

	}
	
	public static void makefile() {
		FileOutputStream fos = null;
		try{
			fos = new  FileOutputStream("E:\\file\\aaaa.txt");
			fos.write(("Hello world \r".getBytes()));
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}finally{
			if(fos != null){
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
