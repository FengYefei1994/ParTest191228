package INaOUT;

public class OuterClass {
	//在外部类实例化内部类对象引用 
	private innerClass in=new innerClass();
	
	//实例化内部类对象
	OuterClass.innerClass IN1=new OuterClass.innerClass();
	//OuterClass.innerClass IN1=Outer.new innerClass();
	
	//内部类
	 class innerClass{
		 innerClass(){                                               //内部类构造方法
			 System.out.println("内部成员1");
		 }
		 public void inf() {                                         //内部类成员方法
			 System.out.println("内部成员2");
		 }
		 int y=0;                                                    //定义内部类成员变量
	 }
	 
	 
	//在外部类方法中调用内部类方法
		 public void outf() {
			 in.inf();
		 }

		 public innerClass doit() {                                      //外部类方法，返回值为内部类引用
			 //y=4;                                                      //外部类不可以直接访问内部类成员变量
			 in.y=4;
			 return new innerClass();                                    //返回内部类引用
		 }
		 
}

