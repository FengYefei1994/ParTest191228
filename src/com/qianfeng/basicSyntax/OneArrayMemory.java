//����ʵ��������new�ؼ��֣��������Ϊ�ؼ����ڶѣ�heap���Ͽ����ڴ�ռ䣬ȥ�洢����ֵ��������ʵ�������ܸı��С
//���д洢����ʱ���Բ�ͬ�ֽ���Ϊһ����Ԫ���һ������
//ջ���Ǻ����ѷţ�main����������ײ㣩���ϲ�Ϊ�����з��������õķ���
//array �����������ݡ���ջ��ռ8Byte�ڴ棬��ջ�д洢ʱ�洢��Ԫ�ص��ڶ��е�ַ

//int:0X000��0X004
//byte:0X000��0x001
//long:0X000��0X008
//��Ԫ�ط��ʣ��ڴ�ƫ�Ƶ�λ����array���ö��ڴ�

package com.qianfeng.basicSyntax;

public class OneArrayMemory {
	public static void main(String[] args){
		int num1=1024*1024*2;                                                   //������Ԫ�ظ���
		int[] arr1=new int[num1];                                                //����int��һά����
		for (int i=0;i<arr1.length;i++){
			arr1[i]=i;
		}
		//���ռ���ڴ�������������λת��ΪMB
		long memory1=Runtime.getRuntime().totalMemory()/1024/1024;
		System.out.println("��һά����洢ռ���ڴ�����Ϊ��"+memory1);
		
		int num2=1024*1024;                                                         //������Ԫ�ظ���
		int[][] arr2=new int[num2][2];                                                //����int�Ͷ�ά����
		for(int i=0;i<arr2.length;i++){
			arr2[i][0]=i;                                                           //Ԫ�ظ�ֵ
			arr2[i][1]=i;                                                            //Ԫ�ظ�ֵ
		}
		//���ռ���ڴ�������������λת��ΪMB
		long memory2=Runtime.getRuntime().totalMemory()/1024/1024;
		System.out.println("�ö�ά����洢ռ���ڴ�����Ϊ��"+memory2);
	}
}
