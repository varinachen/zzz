package zzz0915;
import java.util.Scanner;

public class PM2_6 {
	public static void main(String[]args) {
		//計算數學方程式：要求輸入一個值後，求出2個公式的相對值
		Scanner keyin = new Scanner(System.in);
		double x;
		System.out.println("方程式計算工具：");
		System.out.printf("請輸入變數 x 的數值=>");
		x = keyin.nextDouble();
		System.out.printf("變數 x = %.2f 計算如下：\n",x);
		double y2;
		y2 = 4*x*x+3*x+2;
		System.out.println("\t4 * x * x + 3 * x + 2 = "+y2);
		double y1;
		y1 = x*x+1;
		System.out.println("\t x * x + 1 = "+y1);
		keyin.close();

	}
}
