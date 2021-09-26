package zzz0915;

import java.util.Scanner;

public class Ex3_1 {
	public static void main(String[]args) {
		//練習等於與變數指定
		//範例-收銀機計算：要求輸入各項金額，並隨時顯示累計金額，最後計算總金額。
		Scanner keyin = new Scanner(System.in);
		int total = 0; // 設定累積器初值為0;
		int item;
		System.out.printf("超商收銀機，請注意是否歸零 =%d\n", total);
		System.out.printf("請輸入汽水的金額 =>");
		item = keyin.nextInt();//由鍵盤讀入一個整數，存入item變數內(指定運算子的功能)
		total = total + item;//將item數值累積存入total變數內，為目前累積的購買金額。
		System.out.printf("\t目前累進金額為 =%d\n", total);
		System.out.printf("請輸入餅乾的金額 =>");
		item = keyin.nextInt();
		total = total + item;
		System.out.printf("\t目前累進金額為 =%d\n", total);
		System.out.printf("請輸入鐵路便當的金額 =>");
		item = keyin.nextInt();
		total = total + item;
		System.out.printf("\t總金額為 =%d 謝謝光臨！", total);
		keyin.close();
		
	}
}
