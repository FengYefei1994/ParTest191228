package com.qianfeng.basicSyntax;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);               //扫描器
		System.out.println("请输入一个年份：");
		long year =scan.nextLong();
		if(year % 4 == 0 && year%100!=0 ||year%400==0)
		{
			System.out.println(year+"年是闰年！");
		}
		else {
			System.out.println(year+"年不是闰年！");
		}

	}

}
