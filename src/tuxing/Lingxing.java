package tuxing;
import java.util.Scanner;                                                 //������

public class Lingxing {
	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);                             //ɨ����
			System.out.println("������ϣ����ӡ���β���(������)��");
			int h=scan.nextInt();                                         //��������
			for(int i=1;i<=h/2+1;i++){
				for(int j=1;j<=h/2+i;j++){
					if(j<(h/2+2-i)){
						System.out.print(" ");
					}else{
						System.out.print("*");}
				}
				System.out.println("");
			}
			for(int i=h/2+2;i<=h;i++){                                   //�°벿���������
				for(int j=1;j<=1.5*h-i+1;j++){                            //����λ�ý��пո���*���λ��
					if(j<(i-h/2)){
						System.out.print(" ");
					}else{
						System.out.print("*");}
				}
				System.out.println("");
			}		
		}
}
