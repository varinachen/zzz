package zzz0915;

public class PM5_1_1 {
	public static void main(String[]args) {
		//累加程式變化：累加從1到1000
		int count;
		int sum = 0;
		for(count=1;count<=1000;count++) {
			sum = sum + count;
		}
		System.out.printf("1+2+...+1000=%d", sum);
	}
}
