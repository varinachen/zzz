package zzz0915;

public class Ex5_2 {
	public static void main(String[]args) {
		//連續累乘程式：total = 1 * 2 * 3 * ... *10(10!)
		int count;
		int total = 1;//累乘程式的累積器必須設定為 1
		for(count=1;count<=10;count++) {
			total = total * count;
			System.out.printf("total*%d=%d\n\n", count,total);
		}
	}
}
