package Interface;

/*1������ӿ��ֻࣺ�г�Ա��������������ʵ��ʵ�ַ�����������ֻ��д������������дʵ���壻������д���췽����
 *2���ӿ��з���Ĭ�϶�����public abstract����
 *3���ӿ��п���д����,��ʱ���Ե����η�Ĭ��public static final��
 *4���ӿ������Զ���ʱ������ͬʱ��ɸ���ֵ������
 */

public interface ICalculate {
	final float PI=(float) 3.1415926;
	float getArea(float r);
	float getCircumference(float r);
	public abstract void test();
}