package cn.bjsxt.TestFile;

import java.io.File;

public class FileTree {
	public static void main(String[] args){
		File f=new File("d:/learngit");
		printFiles(f,0);
	}
	
	static void printFiles(File file,int level){
		for(int i=0;i<level;i++){
			System.out.print("-");
		}
		System.out.println(file.getName());
		if(file.isDirectory()){
			File[] files=file.listFiles();
			for(File temp:files){
				printFiles(temp,level+1);
			}
		}
	}
}
