//静态内部类
package INaOUTstatic1;

public class program {
	public static void main(String[] args) {
		//实例化一个外部类对象
		OuterClass out1=new OuterClass();
			
		//实例化一个内部类对象,通过外部类实例化————————与内部非静态的不同，使用静态方式调用
		//外部类对象out1定义
		OuterClass.InnerClass in3=new OuterClass.InnerClass();     
	}
}
	
class OuterClass{
	public String name;
	protected static class InnerClass{              //内部类修饰符不限定————private、protect
		public String name;
	}
}