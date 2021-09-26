package zzz0915;
import java.util.*;

public class Ex2_5 {
	public static void main(String[]args) {
		//練習不同資料格式輸出
		int value;
		Scanner keyin = new Scanner(System.in);
		//由鍵盤(System.in)讀入一個整數，並儲存在value容器內
		System.out.print("請輸入一個整數=>");
		value = keyin.nextInt();
		System.out.printf("\t 10 進位表示= %d\n", value);
		System.out.printf("\t 16 進位表示= %x\n", value);
		System.out.printf("\t 8 進位表示= %o\n", value);
		System.out.printf("\t 浮點數表示= %.2f\n", (float)value);
		keyin.close();

	}
}
