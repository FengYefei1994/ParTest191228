package arrarys;

public class Arr1 {
	public static void main(String[] args){
		int arr[] =new int[]{63,4,24,1,3,13};
		System.out.print("{");
		for (int i=0;i<arr.length-1;i++){
			System.out.print(arr[i]+",");
			}
		int i=arr.length-1;
		System.out.print(arr[i]);
		System.out.print("}");
	}
}
