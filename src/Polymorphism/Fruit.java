package Polymorphism;

//���������
abstract class Fruit {

	// ������ɫ��Ա����
	public String color;

	
	//�����Ա���������������������вΡ��޲ξ��ɣ���Ҫ�����нṹ�塪��{}
	//����������������ͬ�����������췽�����вΡ��޲Σ�
	public Fruit() {
		color = "��ɫ"; // ��color���г�ʼ��
	}
	
	//�����Ա�����������������������󷽷������󷽷�����һ����abstract���ͣ���Ȼ����࣬û�нṹ��
	public abstract void harvest();
}

