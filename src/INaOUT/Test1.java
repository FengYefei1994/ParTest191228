package INaOUT;


public class Test1 {
	public static void main(String[] args) {
		 OuterClass out=new OuterClass();
		 //�ڲ���Ķ���ʵ���������������ⲿ������ⲿ���еķǾ�̬������ʵ��
		 OuterClass.innerClass in=out.doit();
		 
		 //�ⲿ
		 OuterClass.innerClass in2=out.new innerClass();
		
		//x.new A()�� x��E��ʵ�����������ⲿ��������ʱ������static���Σ���̬ʹ�þ�̬�����򱨴�
		OuterClass1 out1=new OuterClass1();
		
		//�ڲ���ķ�����ʹ��static����
		OuterClass1.InnerClass1 in3=new OuterClass1.InnerClass1();
	 }
	
public static class OuterClass1{
	public String name1;
	static class InnerClass1{              //�ڲ������η����޶�
		public String name1;
	}
}
}