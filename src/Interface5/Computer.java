package Interface5;

/*
 * ������
 * 1�����USB�ӿڣ�����2����
 * 2��ͬʱ����USB�豸������OK�󣬵�������豸��Ϣ
 * 3��������Ҫһ����������豸��Ϣ
 */
public class Computer {
	private USB usb1;            //��USB����Ϊ�ӿ�����
	private USB usb2;
/*
 * 	���������ӵ�USB�˿ڣ�����ͨ����������������������
 */
	public void setusb1(USB usb1) {
		this.usb1=usb1;
		System.out.println("usb1��ǰ���ӣ�"+this.usb1.getInfo());
	}
	
	public void setusb2(USB usb2) {
		this.usb2=usb2;
		System.out.println("usb2��ǰ���ӣ�"+this.usb2.getInfo());
	}
}
