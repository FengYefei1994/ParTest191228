//计算有问题，输出汉字个数不对

package com.qianfeng.basicSyntax;
import java.util.regex.Pattern;

public class ChineseAmount {
	public static void main(String[] args) {
		String text="明日科技soft";
		int amount=0;
		for(int i=0;i<text.length();i++) {
			boolean matches=Pattern.matches("^[\u4E00-\u9FA5]{0,}$",""+text.charAt(i));   //判断字符是否属于汉字编码——————正则表达式
			if(matches) {
				amount++;      //汉字则amount计数
			}
		}
	System.out.println("明日科技 soft"+"中有"+amount+"个汉字");
	}
}
