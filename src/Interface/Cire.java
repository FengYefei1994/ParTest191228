package Interface;

/*
 * 1���ӿڣ�����֮�󣬸�ĳһ����ȥʵ�֣�ʹ��implement�ؼ���
 * 2��ʹ�ýӿڡ��̳������߲��޳�ͻ������д�̳���дʵ�֣�public abstract class Cire extends Obj implements ICalculate{}
 * 3��һ����ʵ����һ���ӿڣ�������Ϊ�ӿڵ�ʵ����
 * 4���ӿڿɹ������ʵ�֣�һ�����ʵ�ֶ���ӿ�
 */

public abstract class Cire implements ICalculate{
	public float getArea(float r) {
		float area =PI*r*r;
		return area;
	}
	
	public float getCircumference(float r) {
		float circumference =2*PI*r;
		return circumference;
	}
}
