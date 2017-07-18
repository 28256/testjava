package cn.bjsxt.TestException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestException {
	public static void main(String[] args){
		FileReader reader=null;//放在catch外的原因是，声明为全局变量，有助于finally里面使用
		try{
			reader=new FileReader("d:/learngit/test.txt");
			char c=(char)reader.read();
			System.out.println(c);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){    //一个try可以对应多个catch，但是在顺序安排上需注意
			e.printStackTrace();
		}finally{
			try {
				reader.close();//常常在finally中关闭程序块已打开的资源
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
				
		
		}
}
