/*
 * ע�����
 *1������ӿڷ����ڸ������Ѿ���ʵ�֣�����ɼ̳�ʵ�ַ�����������дʵ�ַ�����
 *       ��������ʽtoString��������dog�в�����д�����ڸ������Ѿ�ʵ��
 *2��ʵ�ֶ���ӿ�ʱ������ظ��ķ�����������һ�Ρ�
 */

package Interface4;

public class Dog extends Animal implements CanBark,Canwalk{    //�̳�animal��ʵ��Canbark���̳��࣬ʵ�ֽӿڣ�

	//�����ӿ��еķ�������Ҫ��дʵ��
	//toString�Ѿ�ʵ����
	
	@Override
	public void bark() {
		// TODO Auto-generated method stub	
	}
	@Override
	public void walk() {
		System.out.println("����ɢ��");	
	}
	
	
	//������Override���֣��ޱ�����Ϊ��CanBark������ʵ�ַ���
}
