package zzz0915;
import java.util.Scanner;

public class Ex3_4 {
	public static void main(String[]args) {
		//資料型態變換時機 範例：兩整數相除結果
		int value1;
		int value2;
		int div;
		float div1;
		Scanner keyin = new Scanner(System.in);
		System.out.printf("請輸入兩個整數(value1 value2)=>");
		value1 = keyin.nextInt();
		value2 = keyin.nextInt();
		//利用 Scanner 函數讀入兩個整數，正常情況是使用者輸入兩個整數，再敲入『Enter』鍵，如果僅輸入一個整數，則系統會等待使用者再輸入 一個整數。
		
		//整數相除得到整數，存入浮點數變數
		div1 = value1/value2;
		System.out.printf("未轉換 =>%d/%d = %f\n", value1,value2,div1);
		
		//一個整數轉換成浮點數，再除以另一個整數，結果存入浮點數變數
		div1 = (float)value1/value2;//將 value1 內容轉換成浮點數
		System.out.printf("已轉換 =>(float)%d/%d = %f\n", value1,value2,div1);
		
		//強迫轉換另一個整數變數
		div1 = value1/(float)value2;//將 value2 內容轉換成浮點數
		System.out.printf("已轉換 =>%d/(float)%d = %f\n", value1,value2,div1);
		keyin.close();

	}
}
