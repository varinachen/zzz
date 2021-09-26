package zzz0915;
import java.util.Scanner;

public class PM3_5 {
	public static void main(String[]args) {
		//溫度轉換工具
		//攝氏=(華氏-32.0)*5/9
		//華氏=攝氏*(9/5)+32.0
		Scanner keyin = new Scanner(System.in);
		float c;//攝氏Celsius
		float f;//華氏Fahrenheit
		System.out.println("*** 攝氏/華氏溫度轉換工具 ***");
		System.out.printf("請輸入華氏溫度 =>");
		f = keyin.nextFloat();
		c = (f-32)*5.0F/9.0F;//公式(9/5)需轉為浮點數值才會以浮點數計算
		System.out.printf("華氏 %.2f度 = 攝氏 %.2f度\n",f,c);
		System.out.printf("請輸入攝氏溫度 =>");
		c = keyin.nextFloat();
		f = c*((float)9/(float)5)+32;//公式(9/5)需轉為浮點數值才會以浮點數計算
		System.out.println(f);
		System.out.printf("攝氏 %.2f度 = 華氏 %.2f度", c,f);
		keyin.close();
	}
}
