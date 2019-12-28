package Interface5;

/*
 * 电脑类
 * 1、多个USB接口（考虑2个）
 * 2、同时连接USB设备，连接OK后，电脑输出设备信息
 * 3、电脑需要一个方法输出设备信息
 */
public class Computer {
	private USB usb1;            //把USB均设为接口类型
	private USB usb2;
/*
 * 	将外设连接到USB端口；外设通过以下两个方法进行连接
 */
	public void setusb1(USB usb1) {
		this.usb1=usb1;
		System.out.println("usb1当前连接："+this.usb1.getInfo());
	}
	
	public void setusb2(USB usb2) {
		this.usb2=usb2;
		System.out.println("usb2当前连接："+this.usb2.getInfo());
	}
}
