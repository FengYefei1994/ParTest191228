package arrarys;
import java.util.*;

public class ArraysTools {

	public static void main(String[] args) {
		int[] array= {1,4,2,5,6};
		//排序
		Arrays.sort(array);
		
		//将数组中内容拼接成为一个字符串
		String str=Arrays.toString(array);
		System.out.println(str);
		
		//使用二分查找法，查询元素下标
		Arrays.binarySearch(array, 5);
		
		//从一个数组中拷贝指定数量的元素到新的数组
		Arrays.copyOf(array,3);
		
		
		//从一个数组中拷贝指定范围的元素到新的数组
		Arrays.copyOfRange(array, 2, 5);
		
		//判断两数组元素是否相同;比较的是元素，不是地址
		Arrays.equals(array, array);
		
		//将数组元素更改为指定值
		Arrays.fill(array,10);
	
	}

}
