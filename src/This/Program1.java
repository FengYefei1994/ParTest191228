/*this:对当前对象的引用
 * 1、用在非静态方法中，谁用调用这个方法，this代表谁
 * 2、在构造方法中，this表示被实例化的对象
 * 
 * this引用就是对一个对象的引用
  *  方法体重使用return this形式为将类的对象进行返回
 */

package This;

public class Program1 {
	public static void main(String[] args) {
		Person xiaoming = new Person();
		xiaoming.show(); // xiaoming对象调用show()方法，this代表xiaoming
		System.out.println(xiaoming.name);

		Person wang = new Person("好吧", 10, '男');
		System.out.println(wang.name);

	}

}

//局部变量不允许作用域重叠
//全局变量作用域与局部变量作用域不会重叠，名称相同而已
class Person {
	String name; // 全局变量、属性参数；参数开辟在栈中
	int age;
	char gender;

	Person(String name, int a, char c) { // 形参名称避免与属性名称相同，否则warning变量无效
		this.name = name; // 若参数用name，后续定义变量name按就近原则，用的是形参name，区分时用this指针
	}

	Person() {
		this.name = ""; // 此时this可以省略，无变量歧义；只用知道
		name = "";
	}

	void show() {
		this.name = "小明";
	}
}
