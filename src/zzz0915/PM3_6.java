package zzz0915;
import java.util.Scanner;

public class PM3_6 {
	public static void main(String[]args) {
		//手機計算費率工具
		Scanner keyin = new Scanner(System.in);
		int hour;
		int minute;
		int second;
		int total;
		float price;
		System.out.println("*** 手機通話費計算工具 ***");
		System.out.printf("請輸入通話時間(時 分 秒)=>");
		hour = keyin.nextInt();
		minute = keyin.nextInt();
		second = keyin.nextInt();
		total = second + 60*(minute + 60*hour);
		System.out.printf("通話時間總共 %d 秒\n",total);
		System.out.printf("請輸入每秒計費(如 0.5)");
		price = keyin.nextFloat();
		price = price * total;
		System.out.printf("通話費總共 %d元",(int)price);
		keyin.close();
		
	}
}
