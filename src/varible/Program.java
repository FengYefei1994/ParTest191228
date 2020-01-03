//当行注释

/*声明文件属于哪一个包
 * 创建文件时生成，Java文件的第一句
 * （多行注释）
 */
package varible;

/*
 * class：类
 * Program：类名，可以存在多个class，只有和文件名相同的类可以用public修饰
 */
public class Program {

	/*代表主函数：程序入口
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("hello world!");
	}
	
	public static void show(int a,int...array) {              //int...array定义了一个不定长度整形数组；只能在形参位置定义
		                                                      //在实参位置处可直接赋值使用[show(1,2,3,4,5)]
		                                                      //形参位置定义时，不定长度定义只能放在最后位置，且只能定义一个不定长度数组
		for(int ele:array) {
			System.out.print(ele+",");
		}
	}
	
}
