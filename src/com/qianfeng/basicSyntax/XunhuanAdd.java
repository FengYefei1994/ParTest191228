package com.qianfeng.basicSyntax;

public class XunhuanAdd {
	public static void main(String[] args){
		double i=1,j=1,sum=0;
		while(i<=20){
			sum=sum+1/j;
			j=j*(i+1);
			i++;
		}
		System.out.println("sum="+sum);
	}
}
