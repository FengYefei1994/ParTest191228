//数组实例化，用new关键字，具体操作为关键字在堆（heap）上开辟内存空间，去存储变量值——数组实例化后不能改变大小
//堆中存储数据时，以不同字节数为一个单元存放一个数据
//栈中是函数堆放（main主函数在最底层），上层为流程中方法及调用的方法
//array 引用类型数据——栈中占8Byte内存，在栈中存储时存储首元素的在堆中地址

//int:0X000、0X004
//byte:0X000、0x001
//long:0X000、0X008
//→元素访问：内存偏移单位数、array引用堆内存

package arrarys;

public class OneArrayMemory {
	public static void main(String[] args){
		int num1=1024*1024*2;                                                   //数组中元素个数
		int[] arr1=new int[num1];                                                //创建int型一维数组
		for (int i=0;i<arr1.length;i++){
			arr1[i]=i;
		}
		//获得占用内存总数，并将单位转换为MB
		long memory1=Runtime.getRuntime().totalMemory()/1024/1024;
		System.out.println("用一维数组存储占用内存总量为："+memory1);
		
		int num2=1024*1024;                                                         //数组中元素个数
		int[][] arr2=new int[num2][2];                                                //创建int型二维数组
		for(int i=0;i<arr2.length;i++){
			arr2[i][0]=i;                                                           //元素赋值
			arr2[i][1]=i;                                                            //元素赋值
		}
		//获得占用内存总数，并将单位转换为MB
		long memory2=Runtime.getRuntime().totalMemory()/1024/1024;
		System.out.println("用二维数组存储占用内存总数为："+memory2);
	}
}
