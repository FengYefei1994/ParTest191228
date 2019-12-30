package Random;

/*
 * 两种随机数生成方式：
 * 1、Random ran1=new Random(); 
 * 		int a =ran1.nextInt(30);————random.nextInt(N)，生成[0, N）的随机整数
 *		生成范围内随机数[min, max]， random.nextInt(max) % (max - min + 1) + min 
 * 
 * 2、Math.random()
 * 		生成 [max,min] 范围内的随机数字
 *		int i1 =(int) Math.random() * (max-min+1)+min;
 *3、生成三个随机数，进行三角形构成判断
 */
import java.util.Random;

public class test01 {

	public static void main(String[] args) {
		Random ab=new Random();
		double a=ab.nextDouble()*30+1;
		System.out.println(a);

	}

}
