package com.qianfeng.basicSyntax;

public class Person {
	public String name;
	public int age;
	public char gender;
	
	public Person(String name,int age, char gender) {
		super();
		this.name=name;
		this.gender=gender;
		this.age=age;
	}
	
	//�Զ�����дequal����
		@Override
		public boolean equals(Object obj) {
			//1������Ƚϵ���������ֱ���this��obj
			//�Ƚ���䣺xiaoming.equals(xiaobai);�������this����С��λ�õĶ���
			if(obj==null) {                               //��һ������Ϊ��ʱ������false
				return false;
			}
			
			if(this == obj) {
				return true;
			}
			//�Ƚ���������������Ƿ�һ��
			if(this.getClass()!=obj.getClass()) {                     //getClass()�����Ƿ��ض��������
				return false;
			}
			
			//��������������ͱȽϣ��漰�����ת�͡���obj�����޷�ֱ�����ӵ����Ƚ϶���
			Person other=(Person)obj;
			
			//���αȽ�ÿһ������ֵ
			return this.name.equals(other.name)&&this.age==(other.age)&&this.gender==(other.gender);
		}
	
}
