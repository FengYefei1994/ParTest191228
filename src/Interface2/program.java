package Interface2;

public class program {

	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.bark();
		dog.display();                    //�ӿ��е�default�����ö������
		CanBark.show();                   //�ӿ��е�static�����ýӿڵ���
	}

}
