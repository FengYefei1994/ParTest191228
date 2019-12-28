package Interface2;

public class program {

	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.bark();
		dog.display();                    //接口中的default方法用对象调用
		CanBark.show();                   //接口中的static方法用接口调用
	}

}
