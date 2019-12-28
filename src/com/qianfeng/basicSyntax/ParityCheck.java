package com.qianfeng.basicSyntax;
import java.util.Scanner;

public class ParityCheck{                                   //声明类
	public static void main(String[] args){                   //主方法
		Scanner scan= new Scanner(System.in);  //扫描器
		System.out.println("请输入一个整数：");
		long number =scan.nextLong();                  //接收数据
		String check=(number %2 == 0)?"这个数字是偶数":"这个数字是奇数";
		System.out.println(check);
	}
}
