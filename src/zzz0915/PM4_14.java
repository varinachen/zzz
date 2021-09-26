package zzz0915;
import java.util.Scanner;

public class PM4_14 {
	public static void main(String[]args) {
		//電力公司收費計算工具
		Scanner keyin = new Scanner(System.in);
		int rate;
		double price;
		System.out.print("請輸入使用度數=>");
		rate = keyin.nextInt();
		if(rate <= 50) {
			price = 150;
			System.out.printf("電費應收取%.0f",price);
		}if(rate > 50 && rate <= 100) {
			rate = rate - 50;
			price = 150 + rate*5;
			System.out.printf("電費應收取%.0f",price);
		}if(rate > 100 && rate <= 150) {
			rate = rate - 100;
			price = 150 + 50*5 + rate*6;
			System.out.printf("電費應收取%.0f",price);
		}if(rate > 150 && rate <= 200) {
			rate = rate - 150;
			price = 150 + 50*5 + 50*6 + rate*7;
			System.out.printf("電費應收取%.0f",price);
		}if(rate>200){
			rate = rate - 200;
			price = 150+ 50*5 + 50*6 + 50*7 + rate*8;
			System.out.printf("電費應收取%.0f",price);
		}
		keyin.close();
	}
}
/*
 * 電費計算方式如下:
 * (1) 50 度以內，收基本電費 150 元 。 
 * (2) 51~100 度，每度電價為 5.0 元 。 
 * (3) 101~150 度，每度電價為 6.0 元 。 
 * (4) 151~200 度，每度電價為 7.0 元 。 
 * (5) 200 度以上，每度電價為 8.0 元 。
 */