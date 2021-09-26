package zzz0915;

import java.util.Scanner;

public class Ex4_2 {
	public static void main(String[]args) {
		//分歧流程 - if
		//簡單計算器製作
		Scanner keyin = new Scanner(System.in);
		double value;
		double square;//求平方根值
		System.out.printf("請輸入一個浮點數=>");
		value = keyin.nextDouble();//顯示要求輸入一個浮點數，讀入後儲存於 value 變數內。
		//if 敘述句，如果條件成立的話(value > 0)，則執行左右大括號內({ ..... })的程式實體(program body);
		//該實體又稱為『if body』
		if (value>0) {//大於零才算平方根值
			square = Math.sqrt(value);
			System.out.printf("%.2f的平方根值為 =%.2f\n", value,square);//印出計算內容
		}
		//緊接著 if 敘述句後下一個敘述句，無論 if 敘述的條件是否成立，皆會執行到該敘述句。
		System.out.printf("程式結束\n");
		keyin.close();
	
	}
}
