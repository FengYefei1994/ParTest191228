package com.qianfeng.basicSyntax;
import java.util.Scanner;

public class Anli {
	public static void main(String[] args){                   //������
		Scanner scan= new Scanner(System.in);                 //ɨ����
		System.out.println("���������ΰ뾶��");
		double r=scan.nextDouble();                           //��������
		scan.close();
		final double PI=3.1415926;                            //���峣��PI      ���峣����䣺final  ��������  ��������[=ֵ]         
		double volume=4.0/3.0*PI*r*r*r;                       //�����ε����
		System.out.println("��������ǣ�"+volume);
		System.out.println("���ΰ뾶�ǣ�"+r);
		System.out.println("Բ�����ǣ�"+PI);
	}
}
