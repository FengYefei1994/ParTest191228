package lesson9;
//���������

abstract class Fruit {                      //���������
	public String color;                    //������ɫ��Ա����
	//���幹�췽��
	public Fruit() {
		color="��ɫ";                        //��color���г�ʼ��
	}
	//������󷽷�
	public abstract void harvest();//��Ȼ����࣬û�нṹ��
}


/*��������ࣨFruit���������Ա��������Ա����

*public class Fruit {
	public String color;
	public Fruit() {
		color="��ɫ";
	}
	��Ա�������вΡ��޲ξ��ɣ���Ҫ�����нṹ�塪��{}��
	public void harvest() {
	}
}
*/

/*����ӿ��ֻࣺ�г�Ա��������������ʵ��ʵ�ַ���

public interface ICalculate {
final float PI=(float) 3.1415926;
float getArea(float r);
float getCircumference(float r);
}
*/