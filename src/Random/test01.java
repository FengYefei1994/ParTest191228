package Random;

/*
 * ������������ɷ�ʽ��
 * 1��Random ran1=new Random(); 
 * 		int a =ran1.nextInt(30);��������random.nextInt(N)������[0, N�����������
 *		���ɷ�Χ�������[min, max]�� random.nextInt(max) % (max - min + 1) + min 
 * 
 * 2��Math.random()
 * 		���� [max,min] ��Χ�ڵ��������
 *		int i1 =(int) Math.random() * (max-min+1)+min;
 *3��������������������������ι����ж�
 */
import java.util.Random;

public class test01 {

	public static void main(String[] args) {
		Random ab=new Random();
		double a=ab.nextDouble()*30+1;
		System.out.println(a);

	}

}
