package Interface5;

/*
 * 1、键盘、鼠标通过USB连接电脑；
 * 2、USB连接电脑时，输出设备信息
 */

public class program {

	public static void main(String[] args) {
		//实例化对象
		Keyboard keyboard=new Keyboard("罗技",20);
		Mouse mouse=new Mouse("牧马人",15);
		
		Computer computer=new Computer();
		
		//鼠标连接电脑的USB1
		computer.setusb1(mouse);
		//键盘连接电脑的USB2
		computer.setusb2(keyboard);
	}

}
