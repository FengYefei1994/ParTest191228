package lesson9;

public class Farm {

	public static void main(String[] args) {
		System.out.println("����Apple���harvest()�����Ľ����");
		Apple apple=new Apple();                                        //����Apple���һ������apple���������ڴ�
		apple.harvest();                                                //����Apple�ķ���
		System.out.println("����Orange���harvest()�����Ľ����");
		Orange orange=new Orange();
		orange.harvest();
	}
}
