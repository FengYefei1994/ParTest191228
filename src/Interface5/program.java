package Interface5;

/*
 * 1�����̡����ͨ��USB���ӵ��ԣ�
 * 2��USB���ӵ���ʱ������豸��Ϣ
 */

public class program {

	public static void main(String[] args) {
		//ʵ��������
		Keyboard keyboard=new Keyboard("�޼�",20);
		Mouse mouse=new Mouse("������",15);
		
		Computer computer=new Computer();
		
		//������ӵ��Ե�USB1
		computer.setusb1(mouse);
		//�������ӵ��Ե�USB2
		computer.setusb2(keyboard);
	}

}
