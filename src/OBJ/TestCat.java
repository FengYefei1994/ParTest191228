package OBJ;

public class TestCat {
	public static void main(String[] args) {                   //主函数用static修饰，表示函数实例化，在调用对象方法时可正常运行，否则只能调用静态方法
		Cat muahua=new Cat();                                  //1、新建对象	
		muahua.name="花";                                      //2、定义对象成员变量
		muahua.age=12;
		muahua.show1();
		
/*		String name="花";
		int age=12;
		System.out.println("大家好，我是一只猫，我叫："+name+",今年"+age+"岁！");
*/		
		Dogs.show();
	}
}
