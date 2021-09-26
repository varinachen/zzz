package zzz0915;
import java.util.Scanner;

public class Ex3_3 {
	public static void main(String[]args) {
		//超商找錢工具
		Scanner keyin = new Scanner (System.in);
		int total;//消費金額
		int paid;//付款金額
		int hundred;
		int fifty;
		int ten;
		int five;
		int one;
		int value;//付款-消費
		int value1;//找零
		System.out.println("*** 超商找錢工具 ***");
		System.out.printf("請輸入消費金額 =>");
		total = keyin.nextInt();
		System.out.printf("請輸入付款金額(大於消費金額%d)",total);
		paid = keyin.nextInt();
		value = paid - total;
		value1 = value;//
		System.out.printf("應找金額 = %d 找零數量如下：\n",value);
		hundred = value/ 100;//計算 100 元零錢的數目
		value = value - hundred*100;//用乘法計算剩餘的錢，計算找 100 元零錢數目後，剩下的找錢數目多寡
		//value1 = value%100;//求餘數，再存入value1容器內
		
		fifty = value/ 50;
		value = value - fifty*50;
		//value1 = value%50;
		ten = value / 10;
		value = value - ten*10;
		//value1 = value%10;
		five = value / 5;
		value = value - five*5;
		//value1 = value%5;
		one = value;
		//one = value1;
		System.out.printf("\t100元鈔票 = %d 張\n", hundred);
		System.out.printf("\t 50元硬幣 = %d 枚\n", fifty);
		System.out.printf("\t 10元硬幣 = %d 枚\n", ten);
		System.out.printf("\t  5元硬幣 = %d 枚\n", five);
		System.out.printf("\t  1元硬幣 = %d 枚\n", one);
		keyin.close();

	}
}
