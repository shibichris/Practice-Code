package practice;

import java.util.Scanner;

public class FindArmstrong {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int n=scn.nextInt();
		scn.close();
		int temp=n;
		int rem=0;
		int sum=0;
		while(n!=0) {
			rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
		}
		if(temp==sum) {
			System.out.println(temp+" is an Armstrong Number");
		}else {
			System.out.println(temp+" is not an Armstrong Number");
		}
	}
}
