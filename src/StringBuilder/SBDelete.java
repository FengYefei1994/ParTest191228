package StringBuilder;

public class SBDelete {
	public static void main(String[] args) {
		String s="命运如同海风——吹着青春的舟，飘摇的，曲折的，渡过了时间的海！";
		StringBuilder sb = new StringBuilder(s);
		System.out.println("原来的字符串是："+sb);
		System.out.println("原来字符串的长度是："+sb.length());
		for(int i=0;i<sb.length();i++){
			for(int j=i+1;j<sb.length();j++) {
				if(sb.charAt(i)==sb.charAt(j)) {
					sb.deleteCharAt(j);
				}
			}
		}	
		System.out.println("现在的字符串是："+sb);
		System.out.println("现在字符串的长度是："+sb.length());
		sb.reverse();
		System.out.println(sb);//字符串反转，只能在StringBuilder类形成的字符串上使用
	}
}