//ʵ���ַ�������

package StringBuilder;

public class EncryptUncrypt {                             
	public static String EAndU(String value,char secret){         //��value���ܣ�secret�����ַ�
		byte[] bt = value.getBytes();                             //����Ҫ���ܵ�����ת��Ϊ�ֽ�����
		for(int i=0;i<bt.length;i++) {
			bt[i]=(byte)(bt[i]^(int)secret);                      //ͨ�����������ܣ���������õ�����������ɣ�
		}
		return new String(bt,0,bt.length);
	}
	

	public static void main(String[] args) {
		String value="�Ұ�JAVA";                                  //��Ҫ��������
		char secert ='��';                                         //�����ַ�
		System.out.println("ԭ�ַ���Ϊ��"+value);
		String encrypt=EncryptUncrypt.EAndU(value,secert);       //����
		System.out.println("���ܺ��ֵ��"+encrypt);
		String uncrypt=EncryptUncrypt.EAndU(encrypt,secert);       //����
		System.out.println("���ܺ��ֵ��"+uncrypt);
		
	}
}