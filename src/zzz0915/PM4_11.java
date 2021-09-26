package zzz0915;
import java.util.Scanner;

public class PM4_11 {
	public static void main(String[]args) {
		//時薪計算工具
		Scanner keyin = new Scanner(System.in);
		int base = 0;
		int hour;
		int over = 0;
		int total = 0;
		int oh = 0;
		System.out.print("請輸入該月工作時數=>");
		hour = keyin.nextInt();
		if (hour<=160) {
			base = hour * 105;//基本薪資
			total = base;
		}
		if (hour>160 && hour<=205) {
			base = 160 * 105;
			over = (int) ((hour-160)*105*1.5);
			total = base + over;
		}
		if (hour>205) {
			base = 160 * 105;
			oh = hour - 205;//不計費的時數
			over = (int) ((hour-160-oh)*105*1.5);
			total = base + over;
		}
		System.out.println("本月薪資如下：");
		System.out.printf("\t基本薪資 = %d\n", base);
		System.out.printf("\t加班費 = %d\n", over);
		System.out.printf("\t總共薪資 = %d\n",total);
		System.out.printf("\t不計費時間 = %d 小時", oh);
		keyin.close();
	}
}
/*
每個月工作時數 160 小時(每周 40 小時)內以基本時薪(105 元/小時)計算; 
161 ~ 205 小時，時薪的 1.5 倍計算，
超過 205 小時的工作時間違反勞基法，不給與薪資。 	
 */
 