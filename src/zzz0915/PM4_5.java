package zzz0915;
import java.util.Scanner;

public class PM4_5 {
	public static void main(String[]args) {
		//多重 if/else 選擇分歧
		//測量身體 BMI 系統 - 計算雕塑身材質量
		//BMI值(體重(kg)/身高(m)/身高(m))，正常值為18 ~ 24;低於18則太瘦，高於24則太胖。
		Scanner keyin = new Scanner(System.in);
		final double skinny = 18.0;
		final double heavy = 24.0;
		double tall;
		double kg;
		double bmi;
		System.out.println("== 歡迎使用 BMI 評估系統(18-24) ==");
		System.out.printf("請輸入客戶身高(公分)=>");
		tall = keyin.nextDouble()/100;//公分換算公尺
		System.out.printf("請輸入客戶體重(公斤)=>\n");
		kg = keyin.nextDouble();
		bmi = kg/tall/tall;
		System.out.printf("客戶BMI值=%.4f\n\n", bmi);
		if(bmi>heavy) {
			kg = kg - heavy*tall*tall;//實際體重-標準BMI值*身高*身高	
			System.out.printf("您的體重過重，建議再減少%.2f公斤\n",kg);
		}else if(bmi<skinny) {
			kg = skinny*tall*tall - kg;//標準BMI值*身高*身高-實際體重
			System.out.printf("您的體重過輕，建議再增加%.2f公斤\n",kg);
		}else {
			System.out.printf("您的體重標準，請繼續保持\n");
		}
		keyin.close();
		System.out.println("\n == 系統結束，歡迎再次光臨 == ");
	}
}
