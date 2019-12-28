package com.qianfeng.basicSyntax;
import java.util.Scanner;                                                 //声明包

public class Lingxing {
	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);                             //扫描器
			System.out.println("请输入希望打印菱形层数(奇整数)：");
			int h=scan.nextInt();                                         //接收数据
			for(int i=1;i<=h/2+1;i++){
				for(int j=1;j<=h/2+i;j++){
					if(j<(h/2+2-i)){
						System.out.print(" ");
					}else{
						System.out.print("*");}
				}
				System.out.println("");
			}
			for(int i=h/2+2;i<=h;i++){                                   //下半部分输出；行
				for(int j=1;j<=1.5*h-i+1;j++){                            //控制位置进行空格与*输出位置
					if(j<(i-h/2)){
						System.out.print(" ");
					}else{
						System.out.print("*");}
				}
				System.out.println("");
			}		
		}
}
