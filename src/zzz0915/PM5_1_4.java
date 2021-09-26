package zzz0915;

public class PM5_1_4 {
	public static void main(String[]args) {
		//累加程式變化：奇數累加從1+3+...+1000
		int count;
		int sum = 0;
		for(count=1;count<=1000;count=count+2) {
			sum = sum + count;
		}
		System.out.printf("1+3+5+...+999=%d", sum);
	}
}
