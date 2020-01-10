package construct;

public class Test {
	public static void main(String[] args) {
		
		Person xiaoming=new Person();                //实例化时，即为调用无参构造
		Person le=new Person("X");                   //实例化时，通过传入参数，调用有参构造——方式1
		
		
		//调用有参构造——方式2ֵ
		Person xiaoming1=new Person("小明",12,'男');
		System.out.println("我的名字是："+xiaoming1.name+"，年龄是："+xiaoming1.age+"岁，性别是："+xiaoming1.gender+"！");
	}
}
