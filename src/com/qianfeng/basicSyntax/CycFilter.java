package com.qianfeng.basicSyntax;

public class CycFilter{
	public static void main(String[] args){
		String[] array =new String[]{"白鹭","丹顶鹤","黄鹂","鹦鹉","老鹰","布谷鸟","黄鹂","鹦鹉","老鹰"};
		System.out.println("在我花园中有很多鸟，最近来了几只老鹰，请帮我把它们抓走。");
		int eagleCount=0;
		for(String string:array){
			if(string.equals("老鹰")){
				System.out.println("发现一只老鹰，已经抓到笼子中");
				eagleCount++;
				continue;
			}
			System.out.println("搜索鸟类，发现了："+string);
		}
	System.out.println("一共抓到了："+eagleCount+"老鹰");
	}
}