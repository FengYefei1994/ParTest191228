package StringBuilder;

public class SBDelete {
	public static void main(String[] args) {
		String s="������ͬ���硪�������ഺ���ۣ�Ʈҡ�ģ����۵ģ��ɹ���ʱ��ĺ���";
		StringBuilder sb = new StringBuilder(s);
		System.out.println("ԭ�����ַ����ǣ�"+sb);
		System.out.println("ԭ���ַ����ĳ����ǣ�"+sb.length());
		for(int i=0;i<sb.length();i++){
			for(int j=i+1;j<sb.length();j++) {
				if(sb.charAt(i)==sb.charAt(j)) {
					sb.deleteCharAt(j);
				}
			}
		}	
		System.out.println("���ڵ��ַ����ǣ�"+sb);
		System.out.println("�����ַ����ĳ����ǣ�"+sb.length());
		sb.reverse();
		System.out.println(sb);//�ַ�����ת��ֻ����StringBuilder���γɵ��ַ�����ʹ��
	}
}