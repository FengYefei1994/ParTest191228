package Xunhuan;

public class BreakCyc{
	public static void main(String[] args){
		System.out.println("\n-------------�жϵ���ѭ��-------------------");
		String[] array=new String[] {"����","������","���","����","��ӥ","������"};
		System.out.println("���㷢�ֵ�һֻ��ӥǰ��������ǰ�涼��ʲô��");
		for(String string:array){
			if (string.equals("��ӥ"))
				break;
			System.out.println("�У�"+string+" ");
		}
		System.out.println("\n-------------�ж�˫��ѭ��-------------------");
		
		int [][] myScores= new int [][]{{67,78,63,22,66},{55,68,78,95,44},{95,97,92,93,81}};
		System.out.println("������ο��Գɼ���\n��ѧ\t ����\t Ӣ��\t ����\t ��ʷ");
		No1:for(int[] is:myScores){
			for(int i:is){
				System.out.println(i+"\t");
				if(i<60){
					System.out.println("\n�ȵȣ�"+i+"�ķ���ʲô�����Ϊʲô������?");
					break No1;
				}
			}
		System.out.println();		
		}	
	}
}