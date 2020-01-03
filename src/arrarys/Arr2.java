package arrarys;

public class Arr2 {
	public static void main(String[] args){
		int arr[] =new int[]{63,4,24,1,3,13};
		int tmp=arr[0];
		//System.out.print("{”);
		for (int i=1;i<arr.length;i++) {
			if(arr[i]>tmp){
				tmp=arr[i];
			}else{
				break;
			}
			//System.out.print(arr[i]);
		}
		System.out.println("数组arr最大元素值为："+tmp);
	}
}

