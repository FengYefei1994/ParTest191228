package arrarys;

public class Arr3 {
	public static void main(String[] args){
		int arr[][] =new int[][]{{4,3,5},{5,2,7},{6,2,6}};
		int sum=0;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				sum=sum+arr[i][j];
			}
		}
		System.out.println("数组arr的元素和为："+sum);
	}
}
