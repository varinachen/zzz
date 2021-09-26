package zzz0915;

public class PM5_1_3 {
	public static void main(String[]args) {
		//累加程式變化：累加從0+2+4+...+1000
		int count;
		int sum = 0;
		for(count=0;count<=1000;count=count+2) {
			sum = sum + count;
		}
		System.out.printf("0+2+4+...+1000=%d", sum);
	}
}
