package Xunhuan;

public class CycFilter{
	public static void main(String[] args){
		String[] array =new String[]{"����","������","���","����","��ӥ","������","���","����","��ӥ"};
		System.out.println("���һ�԰���кܶ���������˼�ֻ��ӥ������Ұ�����ץ�ߡ�");
		int eagleCount=0;
		for(String string:array){
			if(string.equals("��ӥ")){
				System.out.println("����һֻ��ӥ���Ѿ�ץ��������");
				eagleCount++;
				continue;
			}
			System.out.println("�������࣬�����ˣ�"+string);
		}
	System.out.println("һ��ץ���ˣ�"+eagleCount+"��ӥ");
	}
}