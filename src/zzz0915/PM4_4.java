package zzz0915;
import java.util.Scanner;
import java.io.*;

public class PM4_4 {
	public static void main(String[]args) /*throws IOException*/{
		//電影院售票系統
		//系統會詢問客戶欲購買全票(250 元)、優待票(200 元)與 半票(150 元)的數量;隨之輸入客戶所繳納的金額。
		//如果繳納金額大於購票金額的話，則輸出應找零錢(500 元、100 元、50 元與 10 元)的數量;如果不夠則告知客戶，金錢不足請下次再來。
		Scanner keyin = new Scanner(System.in);
		//BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));//一次輸入多項資料才送出
		int p1 = 259;//全票
		int p2 = 200;//優待票
		int p3 = 159;//半票
		int number1;//張數
		int number2;
		int number3;
		int total;
		int pay;
		int change;
		int hundred;
		int fifty;
		int ten;
		int five;
		int one;
		System.out.printf("購買全票張數(250元)=>");
		number1 = keyin.nextInt();
		System.out.printf("購買優待票張數(200元)=>");
		number2 = keyin.nextInt();
		System.out.printf("購買半票張數(150元)=>");
		number3 = keyin.nextInt();
		total = p1*number1 + p2*number2 + p3*number3;
		System.out.printf("請輸入付款金額");
		pay = keyin.nextInt();
		change = pay - total;
		//System.out.println(change);

		if(pay>=total) {
			System.out.printf("全票 %d 張，優待票 %d 張，半票 %d 張\n", number1,number2,number3);
			System.out.printf("總計 %d 元，付款 %d 元\n應找金額 = %d，找零數量如下：\n", total,pay,change);
			hundred = change/100;
			change = change%100;//找零除以100的餘數
			//System.out.println(change);
			System.out.printf("\t百元鈔票＝ %d 張\n",hundred);
			fifty = change/50;
			change =  change%50;
			System.out.printf("\t伍拾元硬幣= %d 枚\n",fifty);
			ten = change/10;
			change =  change%10;
			System.out.printf("\t拾元硬幣= %d 枚\n",ten);
			five = change/5;		
			change = change%5;
			System.out.printf("\t伍元硬幣= %d 枚\n",five);
			one = change;
			System.out.printf("\t壹元硬幣= %d 枚\n",one);
		}else {
			System.out.printf("總計 %d 元，付款 %d 元\n金額不足，請下次再來，謝謝！\n", total,pay);
		}
		keyin.close();
	}
}
