package INaOUT;

public class OuterClass {
	//���ⲿ��ʵ�����ڲ���������� 
	private innerClass in=new innerClass();
	
	//ʵ�����ڲ������
	OuterClass.innerClass IN1=new OuterClass.innerClass();
	//OuterClass.innerClass IN1=Outer.new innerClass();
	
	//�ڲ���
	 class innerClass{
		 innerClass(){                                               //�ڲ��๹�췽��
			 System.out.println("�ڲ���Ա1");
		 }
		 public void inf() {                                         //�ڲ����Ա����
			 System.out.println("�ڲ���Ա2");
		 }
		 int y=0;                                                    //�����ڲ����Ա����
	 }
	 
	 
	//���ⲿ�෽���е����ڲ��෽��
		 public void outf() {
			 in.inf();
		 }

		 public innerClass doit() {                                      //�ⲿ�෽��������ֵΪ�ڲ�������
			 //y=4;                                                      //�ⲿ�಻����ֱ�ӷ����ڲ����Ա����
			 in.y=4;
			 return new innerClass();                                    //�����ڲ�������
		 }
		 
}

