package com.qianfeng.basicSyntax;
import java.util.StringTokenizer;

public class StringTo {
	public static void main(String[] args){
		String text="  We are atudents!  ";
		System.out.println("ԭ�ַ����ǣ�"+text);
		StringTokenizer st=new StringTokenizer(text," ");                         //ɾ���ַ����пո�
		StringBuffer sb=new StringBuffer();                                       //�����ַ����������
		int i=1;
		while(st.hasMoreTokens()){
			i++;
			sb.append(st.nextToken());                                           //���ַ�����������׷������
		}
		System.out.print("ȥ���ַ������пո����ַ����ǣ�");
		System.out.println(sb.toString());
	}
}
