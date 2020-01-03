package StringBuilder;
import java.util.StringTokenizer;

public class StringTo {
	public static void main(String[] args){
		String text="  We are atudents!  ";
		System.out.println("原字符串是："+text);
		StringTokenizer st=new StringTokenizer(text," ");                         //删除字符串中空格
		StringBuffer sb=new StringBuffer();                                       //定义字符串缓存对象
		int i=1;
		while(st.hasMoreTokens()){
			i++;
			sb.append(st.nextToken());                                           //向字符串生成器中追加内容
		}
		System.out.print("去掉字符串所有空格后的字符串是：");
		System.out.println(sb.toString());
	}
}
