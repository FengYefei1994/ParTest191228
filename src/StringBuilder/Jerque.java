package StringBuilder;

public class Jerque {

	public static void main(String[] args) {
/*		String str="";                                          //�������ַ���
		long startTime=System.currentTimeMillis();
		for(long i=0;i<10000;i++) {
			str=str+i;                                          //ѭ��׷���ַ���
		}
		long endTime=System.currentTimeMillis();
		long time=endTime-startTime;
		System.out.println("String����ʱ��Ϊ��"+time);
*/		
		StringBuilder builder=new StringBuilder("");            //�����ַ���������
		long startTime=System.currentTimeMillis();
		for(long j=0;j<10000;j++) {
			builder.append(j);
		}
		long endTime=System.currentTimeMillis();
		long time=endTime-startTime;
		System.out.println("StringBuilder����ʱ��Ϊ��"+time);
	}
}
