package Inherit;
import java.util.Date;

public class Employee {
	private String name;
	private double salary;
	private Date birthday;
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public void setName2(String name){
		this.name=name;
	}
	
	public double getsalary(){
		return salary;
	}
	
	public void setsalary(double salary){
		this.salary=salary;
	}
	
	public Date getbirthday(){
		return birthday;
	}
	
	public void setbirthday(Date birthday){
		this.birthday=birthday;
	}
}
