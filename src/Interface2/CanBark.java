package Interface2;

public interface CanBark {
	void bark();
	String toString();
	
/*
 *1��Java8 ���Ժ󣬽ӿ�������static���η��������static���������ʵ�ַ������˾�̬��������ʱ�ýӿڵ��á�
 *2��Java8�п�����default���νӿڷ��������ʵ�ַ����������ӿ����һ��Ĭ�ϵ�ʵ�ַ�������д������;�˷����ö������
 */
	

	static void show() {
		System.out.println("Hello World!");
	}
	
	default void display() {
		System.out.println("��");
	}
}
