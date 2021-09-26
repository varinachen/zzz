package zzz0915;
import java.util.Scanner;

public class PM3_1 {
	public static void main(String[]args) {
		//學期成績計算程式
		Scanner keyin = new Scanner(System.in);
		int score;
		int sum = 0;//定義一個整數
		float ave;//定義一個浮點數
		System.out.println("*** 學期成績計算系統(各科學分數) ***");
		System.out.printf("請輸入電腦概論成績(2 學分)=>");
		score = keyin.nextInt();
		sum = sum + score * 2;
		System.out.printf("請輸入程式設計成績(3 學分)=>");
		score = keyin.nextInt();
		sum = sum + score * 3;
		System.out.printf("請輸入離散數學成績(3 學分)=>");
		score = keyin.nextInt();
		sum = sum + score * 3;
		System.out.printf("請輸入國文成績(2 學分)=>");
		score = keyin.nextInt();
		sum = sum + score * 2;
		System.out.printf("請輸入英文成績(2 學分)=>");
		score = keyin.nextInt();
		sum = sum + score * 2;
		ave = sum/12.0F;//共12學分，得讓整數除以浮點數(12.0F)，才會得到浮點數的結果。
		System.out.printf("學期總平均分數 = %.2f\n", ave);
		ave = ave + 0.5F ;//用加0.5F來保留整數位的應用
		//例：ave = 1.6+0.5F=2.1(已進位變2); ave = 1.4+0.5F=1.9(沒進位維持1)
		System.out.printf("四捨五入後成績= %d",(int)ave);//加int轉換成整數
		keyin.close();

	}
}
