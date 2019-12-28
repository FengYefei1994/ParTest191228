package StringBuilder;

public class CharacterUnicode {
	public static void main(String[] args) {
		String text ="明日 soft";
		char[] charArray=text.toCharArray();                  //获取字符串的字符数组
		StringBuilder builder =new StringBuilder();           //创建字符串生成器
		for(char c:charArray) {
			builder.append((int)c+" ");
		}
		System.out.println("明日 soft的Unicode码是：");
		System.out.println(builder.toString());               //结果输出至文本框
	}
}
