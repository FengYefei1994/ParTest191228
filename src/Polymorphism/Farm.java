package Polymorphism;

public class Farm {

	public static void main(String[] args) {
		
		// �׶�1�������.�෽��/���� System.out.println("����Apple���harvest()�����Ľ����");
		System.out.println("�׶�1");
        // ����Apple���һ������apple���������ڴ� apple.harvest(); ����Apple�ķ���
		Apple apple = new Apple();
		System.out.println("����Orange���harvest()�����Ľ����");
		Orange orange = new Orange();
		orange.harvest();		 
		
		//�׶�2�����������������.���෽��/���ԣ��ɸ��෽���룬ȥ�����������ʵ�֣�
		System.out.println("");
		System.out.println("�׶�2");
		System.out.print("����Fruit���ƻ�����󣬵�����harvest()�����Ľ����");
		Fruit fruit = new Apple();
		fruit.harvest();

		System.out.print("����Fruit������Ӷ��󣬵�����harvest()�����Ľ����");
		Fruit fruit2 = new Orange();
		fruit2.harvest();



		/*
		 * �׶�3���Ѹ�����󷽷��������壩���ָ��ݸ���������Ϊ����/����ֵ��дһ���࣬���ں����������ά��
		 * �����¶���ʱ��
		 * 1�����Ӷ����࣬��ɶ��󷽷�
		 * 2�������������е��ò���
		 */
		
		//������Ϊ�����β�
		System.out.println("");
		System.out.println("�׶�3");
		System.out.println("������Ϊ�����β�");
		Fruit apple2 = new Apple();
		Fruit orange2 = new Orange();
		Collect c1 = new Collect(apple2);
		Collect c2 = new Collect(orange2);
		
		
		//������Ϊ��������
		System.out.println("");
		System.out.println("�׶�4");
		System.out.println("������Ϊ��������");
		Givefruit givef=new Givefruit();
		Fruit f=givef.Givefruit("orange");
		Collect c3=new Collect(f);                     //������һ�η���

	}
}
