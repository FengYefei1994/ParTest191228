//��̬�ڲ���
package INaOUTstatic1;

public class program {
	public static void main(String[] args) {
		//ʵ����һ���ⲿ�����
		OuterClass out1=new OuterClass();
			
		//ʵ����һ���ڲ������,ͨ���ⲿ��ʵ�����������������������ڲ��Ǿ�̬�Ĳ�ͬ��ʹ�þ�̬��ʽ����
		//�ⲿ�����out1����
		OuterClass.InnerClass in3=new OuterClass.InnerClass();     
	}
}
	
class OuterClass{
	public String name;
	protected static class InnerClass{              //�ڲ������η����޶���������private��protect
		public String name;
	}
}