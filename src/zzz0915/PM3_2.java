package zzz0915;
import java.util.Scanner;

public class PM3_2 {
	public static void main(String[]arg) {
		//超商收費系統
		Scanner keyin = new Scanner(System.in);
		int item;
		int total = 0;//購買金額
		int paid;//付款金額
		int change;//找零
		int hundred;
		int fifty;
		int ten;
		int five;
		int one;
		System.out.println("**** 超商收銀機系統 ****");
		System.out.printf("衛生紙(每包 32 元）購買數量 =>");
		item = keyin.nextInt();
		total = total + item * 32;
		System.out.printf("口香糖(每包12元) 購買數量 =>");
		item = keyin.nextInt();
		total = total + item * 12;
		System.out.printf("可樂(每瓶18元) 購買數量 =>");
		item = keyin.nextInt();
		total  = total + item * 18;
		System.out.printf("熱狗(每支17元) 購買數量 =>");
		item = keyin.nextInt();
		total = total + item * 17;
		System.out.printf("請輸入付款金額(大於購買總額=%d)", total);
		paid = keyin.nextInt();
		change = paid - total;//找零總額
		System.out.printf("應找金額=%d 找零數量如下：\n", change);
		hundred = change/100;//找零的百元張數
		change = change%100;//找零扣掉百元單位
		
		fifty = change/50;
		change = change%50;
		
		ten = change/10;
		change = change%10;
		
		five = change/5;
		change = change%5;
		
		one = change;
		System.out.printf("\t100元鈔票 = %d 張\n", hundred);
		System.out.printf("\t 50元硬幣 = %d 枚\n", fifty);
		System.out.printf("\t 10元硬幣 = %d 枚\n", ten);
		System.out.printf("\t  5元硬幣 = %d 枚\n", five);
		System.out.printf("\t  1元硬幣 = %d 枚\n", one);
		keyin.close();

	}
}
