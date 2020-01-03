package varible;

public class BasicSyntax {

	public static void main(String[] args) {
		int a=10;//数据类型  标识符 = 初始值；
		/*
		 * int a; 允许先声明再赋值
		 * a=10;
		 */
		System.out.println(a);
		
		int d=0,b=1,e=2,c=3;//数据类型 标识符1，标识符2，标识符3……
		System.out.println(a+b+c+d+e);

		//每一种数据类型进行声明
		int f=10;//声明完成后，在内存上开辟的空间大小、类型不允许改变
		
		byte g = 127; 
		short h = 11;
		long  i = 10L;//整形数据后加一个L
		
		float j = 10f;//输出10.0——浮点型字面量默认推导类型是double；如果需要给float赋值，需要在后面加一个f
		double k = 10;//输出10。0
		
		boolean m = true;//boolean只有true、false
		
		char n='a';//字符型，用单引号括起来长度为1的字符，可以为空格，不能写“aa”
		//在计算机中以0、1组合形式存储，数字——字符集定义数字与字符间关系：ASCII表
		
		
		/*
		 * 强制类型转换是声明新变量，并用旧变量值赋值新变量；大转换为小的，为强制转换，存在精度损失问题（显式转换）；小的转换为大的为自动转换，不存在精度问题（隐式转换）
		*  强制转换需要额外操作
		*  byte、short、char计算时，自动转换为int类型
		*/
		
		short r=1000;
		int s=r;//自动转换
		
		byte u=(byte) r;//强制转换,byte最大+127，超出范围
		System.out.println(u);
	}

}
