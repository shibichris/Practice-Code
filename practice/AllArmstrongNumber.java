package practice;

public class AllArmstrongNumber {
	public static void main(String[] args) {
		for(int i=100;i<1000;i++) {
			int n=i;
			int m=0;
			int s=0;
			while(n>0) {
				m=n%10;
				s=s+(m*m*m);
				n=n/10;
			}
			if(i==s) {
				System.out.println(i+" is Armstrong Number");
			}
		}
	}
}
