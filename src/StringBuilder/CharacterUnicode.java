package StringBuilder;

public class CharacterUnicode {
	public static void main(String[] args) {
		String text ="���� soft";
		char[] charArray=text.toCharArray();                  //��ȡ�ַ������ַ�����
		StringBuilder builder =new StringBuilder();           //�����ַ���������
		for(char c:charArray) {
			builder.append((int)c+" ");
		}
		System.out.println("���� soft��Unicode���ǣ�");
		System.out.println(builder.toString());               //���������ı���
	}
}
