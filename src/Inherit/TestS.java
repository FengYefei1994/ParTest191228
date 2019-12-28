package Inherit;
import java.lang.reflect.Field;

public class TestS {

	public static void main(String[] args) {
		Student student =new Student();
		Class<?>clazz=student.getClass();
		System.out.println("��ı�׼���ƣ�"+clazz.getCanonicalName());
		try {
			Field id=clazz.getDeclaredField("id");
			System.out.println("����ǰ��id��"+student.getId());
			id.setAccessible(true);
			id.setInt(student,10);
			System.out.println("���ú��id��"+student.getId());
			
			Field name=clazz.getDeclaredField("name");
			System.out.println("����ǰ��������"+student.getName());
			name.setAccessible(true);
			name.set(student, "���տƼ�");
			System.out.println("���ú��name��"+student.getName());
			
			Field male=clazz.getDeclaredField("male");
			System.out.println("����ǰ��male��"+student.isMale());
			male.setAccessible(true);
			male.setBoolean(student,true);
			System.out.println("���ú�ǰ��male��"+student.isMale());
			
			Field account =clazz.getDeclaredField("account");
			System.out.println("����ǰ��account��"+student.getAccount());
			account.setAccessible(true);
			account.setDouble(student,12.34);
			System.out.println("���ú��account��"+student.getAccount());
		}catch(SecurityException e) {
			e.printStackTrace();
		}catch(NoSuchFieldException e) {
			e.printStackTrace();
		}catch(IllegalArgumentException e) {
			e.printStackTrace();
		}catch(IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
