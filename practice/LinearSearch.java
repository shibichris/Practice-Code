package practice;

import java.util.Scanner;

public class LinearSearch {
	public static int linerSearch(int[] arr,int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int[] a1= {5,12,14,6,78,19,1,23,45,34,78,34};
		int key=scn.nextInt();
		System.out.println(key+" is found at index:"+linerSearch(a1,key));
	}
}
