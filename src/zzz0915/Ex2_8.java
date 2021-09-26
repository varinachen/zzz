package zzz0915;
import java.util.Scanner;

public class Ex2_8 {
	public static void main(String[]args) {
		//計算圓參數的系統，輸入圓半徑，系統會輸出圓面積、圓周長與圓體積等相關參數。
		Scanner keyin = new Scanner(System.in);
		//先查出圓參數的計算公式
		final double Pi = 3.14;//此數不變，故設為固定（final	
		double radius;//圓的半徑
		double circum;//圓的周長：Pi乘以半徑的2倍
		double area;//圓面積：Pi乘以半徑的平方
		double volume;//圓體積：半徑的立方乘以3/4
		System.out.println("圓參數計算工具");
		System.out.printf("請輸入圓的半徑 =>");
		radius = keyin.nextDouble();		
		System.out.printf("\t圓半徑 = %.2f 的相關參數如下：\n", radius);
		circum = Pi* radius * 2;
		System.out.printf("\t圓周長 = %.2f\n", circum);
		area = Pi * radius * radius;
		System.out.printf("\t圓面積 = %.2f\n", area);
		volume = 3.0/4.0 * radius * radius * radius;
		System.out.printf("\t圓體積 = %.2f\n", volume);
		keyin.close();
		
	}
}
