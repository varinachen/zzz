package zzz0915;
import java.util.Scanner;

public class Ex4_4 {
	public static void main(String[]args) {
		//多重 if/else 選擇分歧
		//測量身體 BMI 系統
		//BMI值(體重(kg)/身高(m)/身高(m))，正常值為18 ~ 24;低於18則太瘦，高於24則太胖。
		Scanner keyin = new Scanner(System.in);
		final double skinny = 18.0;//將特定數值宣告成固定變數
		final double heavy = 24.0;
		double tall;
		double kg;
		double bmi;
		System.out.println("== 歡迎使用 BMI 評估系統(18-24) ==");
		System.out.println("請輸入客戶身高(公分)=>");
		tall = keyin.nextDouble()/100;//公分換算公尺
		System.out.println("請輸入客戶體重(公斤)=>");
		kg = keyin.nextDouble();
		bmi = kg/(tall*tall);
		System.out.printf("客戶BMI值 =%.2f\n\n", bmi);
		if (bmi>heavy) {
			System.out.println("您的體重過重，需要減重\n");
		}else if(bmi<skinny) {
			System.out.println("您的體重過輕，需要多補充營養\n");
		}else {
			System.out.println("您的體重標準，請繼續保持\n");
		}
		System.out.println("==系統結束，歡迎再度光臨==");
		keyin.close();
	}
}
