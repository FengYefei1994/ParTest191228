package Inherit;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
        //�����ж������ʵ�������Ǿ�̬��ͨ������ʵ�������ã�
		Employee employee =new Employee();
		employee.setName("Java");
		employee.setsalary(1000);
		employee.setbirthday(new Date());
		
		Employer employer =new Employer();
		//employer.setName("C");
		//System.out.println("�ϰ�������"+employer.getName());
		employer.setName("C++");                               //�̳�Employee����������нˮ�����շ���
		employer.setsalary(3000);
		employer.setbirthday(new Date());
		employer.setbonus(2000);
		
		
		System.out.println("Ա��������"+employee.getName());
		System.out.println("Ա��нˮ��"+employee.getsalary());
		System.out.println("Ա�����գ�"+employee.getbirthday());
		System.out.println("�ϰ�������"+employer.getName());
		System.out.println("�ϰ�нˮ��"+employer.getsalary());
		System.out.println("�ϰ����գ�"+employer.getbirthday());
		System.out.println("�ϰ影��"+employer.getbonus());
	}

}
