package OBJ;

public class Aclass {
	public static void main(String[] args) {
	//1��ѧ���ࣺ���ҽ���
	//2����ʦ�ࣺ��ѧ�������ҽ���
	
		Student xiaoming=new Student();
		Teacher teacher=new Teacher();
		
		xiaoming.name="С��";
		xiaoming.age=13;
		xiaoming.gender='��';
		
		teacher.makeIntroduce(xiaoming);
	}
}

