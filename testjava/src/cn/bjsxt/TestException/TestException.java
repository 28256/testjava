package cn.bjsxt.TestException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestException {
	public static void main(String[] args){
		FileReader reader=null;//����catch���ԭ���ǣ�����Ϊȫ�ֱ�����������finally����ʹ��
		try{
			reader=new FileReader("d:/learngit/test.txt");
			char c=(char)reader.read();
			System.out.println(c);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){    //һ��try���Զ�Ӧ���catch��������˳��������ע��
			e.printStackTrace();
		}finally{
			try {
				reader.close();//������finally�йرճ�����Ѵ򿪵���Դ
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
				
		
		}
}
