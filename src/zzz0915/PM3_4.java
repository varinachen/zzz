package zzz0915;
import java.util.Scanner;

public class PM3_4 {
	public static void main(String[]args) {
		//麻將骰子比大小
		Scanner keyin = new Scanner(System.in);
		int number1;
		int number2;
		int number3;
		int number4;
		int max;
		System.out.printf("請輸入東方所擲數目 (3~18) =>");
		number1 = keyin.nextInt();
		System.out.printf("請輸入西方所擲數目 (3~18) =>");
		number2 = keyin.nextInt();
		System.out.printf("請輸入南方所擲數目 (3~18) =>");
		number3  = keyin.nextInt();
		System.out.printf("請輸入北方所擲數目 (3~18) =>");
		number4 = keyin.nextInt();
		max = Math.max(number1,(Math.max(number2, Math.max(number3, number4))));
		System.out.printf("最大數目 => %d", max);
		keyin.close();	
	}
}
