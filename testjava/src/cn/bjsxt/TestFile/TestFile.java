package cn.bjsxt.TestFile;

import java.io.File;
import java.io.IOException;

public class TestFile {
	public static void main(String[] args){
		File f=new File("d:/learngit");
		File f1=new File("d:/learngit/readme.txt");
		File f2=new File(f1,"readme.txt");
		
		File f4=new File(f,"hello.txt");//����һ�����ļ�
		try {
			f4.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File f5=new File("d:/learngit/ddd");
		f5.mkdir();
		File f6=new File("d:/learngit/bucunzai/bucunzai2/bucunzaisan/ddd");
		f6.mkdirs();//���м䲻����ʱ�Զ��ᴴ��
	}
}
