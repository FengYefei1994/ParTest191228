package OBJ;

public class TestCat {
	public static void main(String[] args) {                   //��������static���Σ���ʾ����ʵ�������ڵ��ö��󷽷�ʱ���������У�����ֻ�ܵ��þ�̬����
		Cat muahua=new Cat();                                  //1���½�����	
		muahua.name="��";                                      //2����������Ա����
		muahua.age=12;
		muahua.show1();
		
/*		String name="��";
		int age=12;
		System.out.println("��Һã�����һֻè���ҽУ�"+name+",����"+age+"�꣡");
*/		
		Dogs.show();
	}
}
