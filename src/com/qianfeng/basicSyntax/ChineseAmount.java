//���������⣬������ָ�������

package com.qianfeng.basicSyntax;
import java.util.regex.Pattern;

public class ChineseAmount {
	public static void main(String[] args) {
		String text="���տƼ�soft";
		int amount=0;
		for(int i=0;i<text.length();i++) {
			boolean matches=Pattern.matches("^[\u4E00-\u9FA5]{0,}$",""+text.charAt(i));   //�ж��ַ��Ƿ����ں��ֱ��롪����������������ʽ
			if(matches) {
				amount++;      //������amount����
			}
		}
	System.out.println("���տƼ� soft"+"����"+amount+"������");
	}
}
