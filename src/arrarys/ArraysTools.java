package arrarys;
import java.util.*;

public class ArraysTools {

	public static void main(String[] args) {
		int[] array= {1,4,2,5,6};
		//����
		Arrays.sort(array);
		
		//������������ƴ�ӳ�Ϊһ���ַ���
		String str=Arrays.toString(array);
		System.out.println(str);
		
		//ʹ�ö��ֲ��ҷ�����ѯԪ���±�
		Arrays.binarySearch(array, 5);
		
		//��һ�������п���ָ��������Ԫ�ص��µ�����
		Arrays.copyOf(array,3);
		
		
		//��һ�������п���ָ����Χ��Ԫ�ص��µ�����
		Arrays.copyOfRange(array, 2, 5);
		
		//�ж�������Ԫ���Ƿ���ͬ;�Ƚϵ���Ԫ�أ����ǵ�ַ
		Arrays.equals(array, array);
		
		//������Ԫ�ظ���Ϊָ��ֵ
		Arrays.fill(array,10);
	
	}

}
