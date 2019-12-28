package com.qianfeng.basicSyntax;

public class Testperson {
	public static void main(String[] args){
		Person xiaoming=new Person("xiaoming",12,'ÄÐ');
		Person xiaobai=new Person("xiaobai",12,'ÄÐ');
		
		boolean ret=xiaoming.equals(xiaobai);
		System.out.print(ret);
	}
}
