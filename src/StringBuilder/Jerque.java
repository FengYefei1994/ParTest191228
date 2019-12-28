package StringBuilder;

public class Jerque {

	public static void main(String[] args) {
/*		String str="";                                          //创建空字符串
		long startTime=System.currentTimeMillis();
		for(long i=0;i<10000;i++) {
			str=str+i;                                          //循环追加字符串
		}
		long endTime=System.currentTimeMillis();
		long time=endTime-startTime;
		System.out.println("String消耗时间为："+time);
*/		
		StringBuilder builder=new StringBuilder("");            //构建字符串生成器
		long startTime=System.currentTimeMillis();
		for(long j=0;j<10000;j++) {
			builder.append(j);
		}
		long endTime=System.currentTimeMillis();
		long time=endTime-startTime;
		System.out.println("StringBuilder消耗时间为："+time);
	}
}
