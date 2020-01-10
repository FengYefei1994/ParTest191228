package Inherit;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
        //父类中定义对象实例化（非静态需通过对象实例化引用）
		Employee employee =new Employee();
		employee.setName("Java");
		employee.setsalary(1000);
		employee.setbirthday(new Date());
		
		Employer employer =new Employer();
		//employer.setName("C");
		//System.out.println("老板姓名："+employer.getName());
		employer.setName("C++");                               //继承Employee类中姓名、薪水、生日方法
		employer.setsalary(3000);
		employer.setbirthday(new Date());
		employer.setbonus(2000);
		
		
		System.out.println("员工姓名："+employee.getName());
		System.out.println("员工薪水："+employee.getsalary());
		System.out.println("员工生日："+employee.getbirthday());
		System.out.println("老板姓名："+employer.getName());
		System.out.println("老板薪水："+employer.getsalary());
		System.out.println("老板生日："+employer.getbirthday());
		System.out.println("老板奖金："+employer.getbonus());
	}

}
