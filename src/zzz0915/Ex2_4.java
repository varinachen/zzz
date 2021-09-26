package zzz0915;

public class Ex2_4 {
	public static void main(String[]args) {
		//練習格式化輸出方法 - printf
		//printf ("列印的文字與變數的資料型態與指定格式",變數1,變數2,...)
		//%是標頭記號，一個%表示一個變數。
		String car = "CRV 休旅車";
		int  price = 75;
		System.out.printf("%s 定價是 %d萬元\n",car,price);// %d 十進位; %s 字串	
	}
}
