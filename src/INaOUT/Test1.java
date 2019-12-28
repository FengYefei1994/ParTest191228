package INaOUT;


public class Test1 {
	public static void main(String[] args) {
		 OuterClass out=new OuterClass();
		 //内部类的对象实例化操作必须在外部类或者外部类中的非静态方法中实现
		 OuterClass.innerClass in=out.doit();
		 
		 //外部
		 OuterClass.innerClass in2=out.new innerClass();
		
		//x.new A()， x是E的实例————外部函数定义时必须用static修饰，静态使用静态，否则报错
		OuterClass1 out1=new OuterClass1();
		
		//内部类的方法需使用static修饰
		OuterClass1.InnerClass1 in3=new OuterClass1.InnerClass1();
	 }
	
public static class OuterClass1{
	public String name1;
	static class InnerClass1{              //内部类修饰符不限定
		public String name1;
	}
}
}