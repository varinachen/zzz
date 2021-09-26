package zzz0915;
import java.util.Scanner;

public class PM4_8 {
	public static void main(String[]args) {
		//多重 if/else 選擇分歧
		//新型身材評估系統
		//標準體重-男生：身高減80後，再乘上0.7 女生：身高減70後，再乘上0.6
		Scanner keyin = new Scanner(System.in);
		double tall;
		double kg;
		String sex;//性別為單選,不適合用switch下判斷式
		double standard;
		System.out.println("==  歡迎使用新型身材評估系統  ==");
		System.out.printf("請輸入性別(男/女)=>");
		sex = keyin.next();
		System.out.println("請輸入客戶身高(公分)=>");
		tall = keyin.nextDouble();
		System.out.println("請輸入客戶體重(公斤)=>");
		kg = keyin.nextDouble();
		if (sex.equals ("男")) {
			standard = (tall - 80) * 0.7;
			}else { 
				standard = (tall - 70) * 0.6;
				}
		
		if (kg>standard) {
				System.out.println("您的體重過重，需要減重。\n");
				kg = kg - standard;
				System.out.printf("只要再減少%.2f公斤即可。\n\n",kg);
			}else if(kg<standard) {
				System.out.println("您的體重過輕，需要多補充營養。\n");
				kg = standard - kg;
				System.out.printf("只要再增加%.2f公斤即可。\n\n",kg);
			}else {
				System.out.println("您的體重標準，請繼續保持。\n");
			}
		System.out.println("==  系統結束，歡迎再度光臨  ==");
		keyin.close();
	}
}
