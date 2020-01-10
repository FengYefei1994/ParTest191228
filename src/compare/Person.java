package compare;

public class Person {
	public String name;
	public int age;
	public char gender;

	public Person(String name, int age, char gender) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	// 自定义重写equal方法
	@Override
	public boolean equals(Object obj) {
		// 1、参与比较的两个对象分别是this和obj
		// 比较语句：xiaoming.equals(xiaobai);——因此this代表小明位置的对象
		if (obj == null) {                  // 当一个对象为空时，返回false
			return false;
		}

		if (this == obj) {
			return true;
		}
		// 比较两个对象的类型是否一致
		if (this.getClass() != obj.getClass()) { // getClass()函数是返回对象的类型
			return false;
		}

		// 对象各个参数类型比较，涉及对象的转型——obj对象无法直接连接到待比较对象
		Person other = (Person) obj;

		// 依次比较每一个属性值
		return this.name.equals(other.name) && this.age == (other.age) && this.gender == (other.gender);
	}

}
