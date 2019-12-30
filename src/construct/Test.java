package construct;

public class Test {
	public static void main(String[] args) {
		//���Ե��ù��췽������ʵ��������ʱ���췽�����Զ�����
		//Person xiaoming=new Person();
		//Person le=new Person("X");
		
		
		//ʵ�������ͬʱ�������Խ��г�ʼ����ֵ
		Person xiaoming=new Person("С��",12,'男');
		System.out.println("������"+xiaoming.name+"�����䣺"+xiaoming.age+"���Ա�"+xiaoming.gender+"��");
	}
}
