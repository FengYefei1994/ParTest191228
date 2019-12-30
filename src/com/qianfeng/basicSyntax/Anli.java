package com.qianfeng.basicSyntax;
import java.util.Scanner;

public class Anli {
	public static void main(String[] args){                   //主方法
		Scanner scan= new Scanner(System.in);                 //扫描器
		System.out.println("请输入球形半径：");
		double r=scan.nextDouble();                           //接收数据
		scan.close();
		final double PI=3.1415926;                            //定义常量PI      定义常量语句：final  数据类型  常量名称[=值]         
		double volume=4.0/3.0*PI*r*r*r;                       //求球形的体积
		System.out.println("球形体积是："+volume);
		System.out.println("球形半径是："+r);
		System.out.println("圆周率是："+PI);
	}
}
