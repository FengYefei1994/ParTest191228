//�����ڲ�����ϳ�������߽ӿ�ʹ��

//�����ڲ��ࡪ���������������ʹ�ã���ʾ����������
package INaOUT.noname;

public class program {
	public static void main(String[] args) {
		//�����ڲ��ࡪ�������������ź������ţ�new���������ڲ������ʹ�õ���Animal���е�bark�������������Ϊanimal������
		//ʵ��������animal��������󣬲�������ת��Ϊanimal���ͣ����Կɶ�bark������д
		Animal animal=new Animal() {	
		};
		animal.bark();
		
		//ʵ����һ���ӿڵ�ʵ������󣬲�������ת��Ϊ�ӿ�����
		Canwalk walk=new Canwalk() {
			@Override
			public void walk() {
				System.out.println("walk");
			}
		};
		walk.walk();       //�����ӿ�ʹ��
	}
}

class Animal{                                 //���Ը���Ϊabstract
	public void bark(){
		System.out.println("animal bark");
	}
}

//�����ӿ�ʹ��
interface Canwalk{
	void walk();
}
