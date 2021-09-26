package zzz0915;
import java.util.Scanner;

public class PM4_10 {
	public static void main(String[]args) {
		//美容中心計費工具：以BMI值(kg/m/m)為收費標準。
		//達標(BMI=18~24)之間，每減少0.5BMI則收費1萬元
		Scanner keyin = new Scanner(System.in);
		float tall;
		float weight;
		float bmi;
		float normal;
		int price;
		System.out.printf("請輸入身高(公分)=>");
		tall = keyin.nextFloat()/100;//公分換算公尺
		System.out.printf("請輸入體重(公斤)=>");
		weight = keyin.nextFloat();
		bmi = weight/tall/tall;
		normal = bmi - 23.0F;//需要再減少的bmi值
		System.out.println(bmi+"-23.0="+normal);		
		price = (int)(normal/ 0.5);
		//System.out.println(price);				
		if (bmi < 18.5) 
			System.out.printf("您的體重過輕");
		
		if(bmi > 18.5 && bmi < 22.9) 
			System.out.printf("您的體重標準");
		
		if(bmi > 23.0 && bmi < 24.9) 
			System.out.print("體重過重(輕度增加)，需花費"+(double)price+"萬元達成標準身材");
		if(bmi > 25.0 && bmi < 29.9) 
			System.out.print("第一度肥胖(中度增加)，需花費"+(double)price+"萬元達成標準身材");
		
		if(bmi > 30.0 && bmi < 34.9) 
			System.out.printf("第二度肥胖(重度增加)，需花費"+(double)price+"萬元達成標準身材");
		
		if(bmi > 35.0) {
			System.out.printf("第三度肥胖(病態肥胖)，需花費"+(double)price+"萬元達成標準身材");
		}
		keyin.close();
	}
}

/*
 身材分類評估如下:
(1) 小於 18.5:過輕(無)
(2) 18.5 ~ 22.9:理想體重(無)
(3) 23.0 ~ 24.9:過重(輕度增加)
(4) 25.0 ~ 29.9:第一度肥胖(中度增加) 
(5) 30.0 ~ 34.9:第二度肥胖(重度增加) 
(6) 大於 35.0:第三度肥胖(病態肥胖)
 */
