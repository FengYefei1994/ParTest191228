package Interface4;

public class program {

	public static void main(String[] args) {
		Dog dog=new Dog();
		
		//�����Dog��������ת��Ϊ�ӿ����͡���Canwalk
		Canwalk animal=dog;
		
		//������ת�ͺ�Ķ��󣬵��ýӿ��еķ���������ʵ�ֵ���ʵ�����е�ʵ�ַ�ʽ
		//������ýӿ��г�Ա������ʵ�ַ�ʽΪDog��ʵ�ַ�ʽ������Ϊ�ӿ��еĶ�̬
		animal.walk();
	}
}
