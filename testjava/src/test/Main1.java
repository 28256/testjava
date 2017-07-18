package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
	   public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		   int temp=sc.nextInt();
		   int num=0;	  
		   while(temp>0){
			   if(temp%2==1){
				   num++;
				   temp=(temp-1)/2;
			   }
			   else{
				   temp=temp/2;
			   }
			 
		   }
		   int i=3/2;
		   System.out.println(i);
		   System.out.println(num);
	}}


public class Solution {
    public int NumberOf1(int n) {
    	int count=0;
    	int flag=1;
    	while(flag>n){
    		if((n&flag)!=0)
    			count++;
    		flag=flag<<1;
    	}
    	return count;
    	
    }
}
public class Solution {
    public int NumberOf1(int n) {
    	int count=0;
    	while(n!=0){
    		n=n&(n/2);
    		count++;
    	}
    	return count;
    }
}