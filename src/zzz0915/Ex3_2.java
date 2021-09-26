package zzz0915;
import java.util.Scanner;

public class Ex3_2 {
	public static void main(String[]args) {
		//練習算術運算子
		//範例-計算股票平均價格：製作一套登錄及計算系統，可連續輸入5個交易日的收盤價，並隨時顯示當日的平均價格為何，最後輸出5日平均股價。
		Scanner keyin = new Scanner(System.in);
		float sum = 0;//股價總額
		float ave;//平均股價
		float cost;//單次股票成本
		int day = 0;//交易日
		System.out.println("*** 計算股票均價系統 ***");
		System.out.printf("請輸入第一個交易日股價 =>");
		cost = keyin.nextFloat();
		sum = sum + cost;
		day++;//交易日累增1
		ave = sum/day;
		System.out.printf("(目前平均價 =>%.2f)請輸入第二個交易日股價 =>",ave);
		cost = keyin.nextFloat();
		sum = sum + cost;
		day++;
		ave = sum/day;
		System.out.printf("(目前平均價 =>%.2f)請輸入第三個交易日股價 =>", ave);
		cost = keyin.nextFloat();
		sum = sum + cost;
		day++;
		ave = sum/day;
		System.out.printf("(目前平均價 =>%.2f)請輸入第四個交易日股價 =>",ave);
		cost = keyin.nextFloat();
		sum = sum + cost;
		day++;
		ave = sum/day;
		System.out.printf("(目前平均價 =>%.2f)請輸入第五個交易日股價 =>",ave);
		cost =keyin.nextFloat();
		sum = sum + cost;
		day++;
		ave = sum/day;
		System.out.printf("五日平均價=%.2f", ave);
		keyin.close();

	}
}
