/*
 * 1���������������е���������
 * 2���̳и����з���ʱ�����ඨ��ʱ����extends�ؼ��ּ����õĸ���
 * 3���������Է�˽�з�ʽ�̳и����Ա������������
 * 4�������븸���Ա����&�÷���������ͬ&����ֵ��ͬʱ����Ϊ������д�����౻���أ���ʱ���ʸ����Ա���������ʹ��super�ؼ���
 * 
 */

package Inherit;

public class Employer extends Employee{
	private double bonus;
	public double getbonus(){
		return bonus;
	}
	
	public void setbonus(double bonus){
		this.bonus=bonus;
	}
	
	
	@Override
	public void setName(String name){     //super�ؼ��ִ��������븸���г�Ա����Ա����ͬʱ����������������ʱ����
		super.setName(name+"����");
	}
	
}
