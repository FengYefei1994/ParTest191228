package com.qianfeng.basicSyntax;

public class YanghuiTriangle {
	public static void main(String[] args){
		int triangle[][]=new int[8][];                                          //������ά����
		for(int i=0;i<triangle.length;i++){                                     //������ά����ĵ�һ��
			triangle[i]=new int[i+1];                                           //��ʼ���ڶ��������С
			for(int j=0;j<=triangle[i].length-1;j++){                           //�����ڶ�������
				if(i==0||j==0||j==triangle[i].length-1){                        //������Ԫ�������Ԫ��ֵ��Ϊ1
					triangle[i][j]=1;
				}
				else{
					triangle[i][j]=triangle[i-1][j]+triangle[i-1][j-1];        //����ͨ����ʽ����
				}
				System.out.print(triangle[i][j]+"\t");                         //�������
			}
			System.out.println();
		}
	}
}
