package zzz0915;
import java.util.Scanner;

public class Ex4_7 {
	public static void main(String[]args) {
		//瓦斯費計算工具
		//計費標準如下:若度數小於 20，則瓦斯費為 100元(基本費);若大於 20 度，每度 5 元。
		Scanner keyin = new Scanner(System.in);
		int baseprice = 100;//基本費
		int m3;//度數
		int total;//總計
		System.out.printf("請輸入使用度數=>");
		m3 = keyin.nextInt();
		
		if(m3<=20) {
			total = baseprice;
		}else
		{
			total = baseprice + m3 * 5;
		}
		System.out.printf("應繳費用為 =>%d", total);
		keyin.close();
	}
}
