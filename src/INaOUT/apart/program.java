//��Ա�ڲ���

package INaOUT.apart;

public class program {
	public static void main(String[] args) {
		//ʵ����һ���ⲿ�����
		OuterClass out1=new OuterClass();
			
		//ʵ����һ���ڲ������,ͨ���ⲿ��ʵ����
		//�ⲿ�����out1����
		OuterClass.InnerClass in3=out1.new InnerClass();         //out1���õ��Ͼ䶨��ı���
	}
}
	
class OuterClass{
	public String name;
	protected class InnerClass{              //�ڲ������η����޶�
		public String name;
	}
}

