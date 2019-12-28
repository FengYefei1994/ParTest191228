//成员内部类

package INaOUTapart;

public class program {
	public static void main(String[] args) {
		//实例化一个外部类对象
		OuterClass out1=new OuterClass();
			
		//实例化一个内部类对象,通过外部类实例化
		//外部类对象out1定义
		OuterClass.InnerClass in3=out1.new InnerClass();         //out1运用的上句定义的变量
	}
}
	
class OuterClass{
	public String name;
	protected class InnerClass{              //内部类修饰符不限定
		public String name;
	}
}

