/*this:�Ե�ǰ���������
 * 1�����ڷǾ�̬�����У�˭�õ������������this����˭
 * 2���ڹ��췽���У�this��ʾ��ʵ�����Ķ���
 * 
 * this���þ��Ƕ�һ�����������
 * ��������ʹ��return this��ʽΪ����Ķ�����з���
 */

package This;

public class Program1 {
	public static void main(String[] args) {
		Person xiaoming=new Person();
		xiaoming.show();                             //xiaoming�������show()������this����xiaoming
		System.out.println(xiaoming.name);
		
		Person wang=new Person("��",10,'��');
		System.out.println(wang.name);
		
	}

}
//�ֲ������������������ص�
//ȫ�ֱ�����������ֲ����������򲻻��ص���������ͬ����
class Person{
	String name;                             //ȫ�ֱ��������Բ���������������ջ��
	int age;
	char gender;
	
	
	Person(String name,int a,char c){          //�β����Ʊ���������������ͬ������warning������Ч
		 this.name=name;                       //��������name�������������name���ͽ�ԭ���õ����β�name������ʱ��thisָ��	
	}
	
	Person(){
		this.name="";//��ʱthis����ʡ�ԣ��ޱ������壻ֻ��֪��
		name="";
	}
	
	void show() {
		this.name="С��";
	}	
}
