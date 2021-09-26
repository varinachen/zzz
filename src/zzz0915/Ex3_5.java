package zzz0915;
import java.util.Scanner;

public class Ex3_5 {
	public static void main(String[]args) {
		//Math數學套件：找出最大/最小的數字
		//使用的Math 套件的類別方法（函數）：
		//max(x,y)：回傳x,y的較大值
		//min(x,y)：回傳x,y的較小值
		Scanner keyin = new Scanner(System.in);
		float value1;
		float value2;
		float value3;
		float max;
		float min;
		System.out.println("*** 三個浮點數比較大小工具 ***");
		
		System.out.printf("請輸入三個浮點數(v1 v2 v3)=>");
		value1 = keyin.nextFloat();
		value2 = keyin.nextFloat();
		value3 = keyin.nextFloat();
		
		max = Math.max(value1, Math.max(value2, value3));//先取出v2與v3兩者間較大的數值後，該數值再跟v1比較，得到兩者之間較大的值並存入max變數內
		min = Math.min(value1, Math.min(value2, value3));//先取出v2與v3兩者間較小的數值後，該數值再跟v1比較，得到兩者之間較小的值並存入min變數內
		
		System.out.printf("最大數 => %.2f\n", max);
		System.out.printf("最小數 => %.2f\n", min);
		keyin.close();
		
	}
}
