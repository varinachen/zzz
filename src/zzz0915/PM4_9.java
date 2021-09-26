package zzz0915;
import java.util.Scanner;

public class PM4_9 {
	public static void main(String[]args) {
		//計程車收費工具：3公里內收費70元，之後每滿0.5公里增加10元。
		//輸入行駛公里數，計算並印出應收費用多寡
		int price;
		float km;//公里數
		Scanner keyin = new Scanner(System.in);
		System.out.printf("請輸入公里數=>");
		km = keyin.nextFloat();
		if (km<3) {
			price = 70;
			}else {
				price = 70 + (int)((km-3)/0.5)*10;
				}
		System.out.printf("搭車費用=> %d 元", price);
		keyin.close();
	}
}
