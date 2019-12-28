package com.qianfeng.basicSyntax;
import java.util.*;

public class SelectOrder {
	public static void main(String[] args) {
/*		int[] array= {2,1,5,3};
		Order2(array);//不能直接进行赋值
		for(int ele:array) {
			System.out.print(ele);
		}
*/	
		int[] src= {1,2,3,4,5,6,7,8,9};
		int[] dst= {10,11,2,32,43,54,76};
		copy(src,2,dst,0,4);
		System.out.println(Arrays.toString(dst));
	}


	public static void Order1(int[] array) {
		for(int i=0;i<array.length-1;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
	}

//Order1算法优化（比较过程可能需每次进行交换，优化交换次数，提升效率）
	public static void Order2(int[] array) {
		for(int i=0;i<array.length-1;i++) {
			int temp=i;
			for(int j=i+1;j<array.length;j++) {
				if(array[temp]>array[j]) {
					temp=j;
				}
			}
			if(i!=temp) {
			int temp1 = array[i];
			array[i]=array[temp];
			array[temp]=temp1;
			}
		}	
	}


//数组copy
	public static void copy(int[] src,int srcPos,int[] dst,int dstPos,int length) {
		for(int i=0;i<length;i++) {
			int srcIndex=srcPos+i;
			int dstIndex=dstPos+i;
			if((srcIndex>=src.length)|| (dstIndex >=dst.length)) {
				break;
			}
			dst[dstIndex]=src[srcIndex];
		}
	}
	

}
