package order;

public class BubbleSort {
	public static void main(String[] args){
		int[] array =new int[]{63,4,24,1,3,13};
		System.out.println("ð�����򷨵Ĺ����ǣ�");
		for(int i=1;i<array.length;i++){
			for(int j=0;j<array.length-1;j++){
				if(array[j]>array[j+1]){
					int tmp=array[j];
					array[j]=array[j+1];
					array[j+1]=tmp;
				}				
				System.out.print(array[j]+" ");
			}
		//System.out.print("��");
		for(int j=array.length-1;j<array.length;j++){
			System.out.print(array[j]+" ");
		}
		//System.out.println("��");
		System.out.println("");
		}
	}
}
