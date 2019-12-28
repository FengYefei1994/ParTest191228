//局部内部类
package INaOUTlocal;

public class program {
	public static void main(String[] args) {
		//public static 
	}
	
	static void show() {
		//局部内部类定义
		class InnerClass{
			
		}
		InnerClass class1 =new InnerClass();  //只能在当前方法中使用
	}
}
