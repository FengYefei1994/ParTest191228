//����ע��

/*�����ļ�������һ����
 * �����ļ�ʱ���ɣ�Java�ļ��ĵ�һ��
 * ������ע�ͣ�
 */
package varible;

/*
 * class����
 * Program�����������Դ��ڶ��class��ֻ�к��ļ�����ͬ���������public����
 */
public class Program {

	/*�������������������
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("hello world!");
	}
	
	public static void show(int a,int...array) {              //int...array������һ�����������������飻ֻ�����β�λ�ö���
		                                                      //��ʵ��λ�ô���ֱ�Ӹ�ֵʹ��[show(1,2,3,4,5)]
		                                                      //�β�λ�ö���ʱ���������ȶ���ֻ�ܷ������λ�ã���ֻ�ܶ���һ��������������
		for(int ele:array) {
			System.out.print(ele+",");
		}
	}
	
}
