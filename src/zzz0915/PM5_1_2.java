package zzz0915;

public class PM5_1_2 {
	public static void main(String[]args) {
		//累加程式變化：sum = 100+99+...+1
		int count;
		int sum = 0;
		for(count=100;count>=1;count--) {
			sum = sum + count;
		}
		System.out.printf("100+99+...+1= %d", sum);
	}
}
