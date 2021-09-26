package zzz0915;
import java.util.Scanner;

public class PM4_12 {
	public static void main(String[]args) {
		//評量學期成績等級
		Scanner keyin = new Scanner(System.in);
		int midterm;
		int finalterm;
		int normal;
		int average;
		String level;
		System.out.print("請輸入期中考成績=>");
		midterm = keyin.nextInt();
		System.out.print("請輸入期末考成績=>");
		finalterm = keyin.nextInt();
		System.out.print("請輸入平常成績=>");
		normal = keyin.nextInt();
		average = (int)(midterm*0.3+finalterm*0.3+normal*0.4);
		if(average>90) {
			level = "A";
			System.out.printf("總成績評量為 %s",level);
		}if(average > 80 && average <= 90){
			level = "B";
			System.out.printf("總成績評量為 %s",level);
		}if(average >70 && average <= 80) {
			level = "C";
			System.out.printf("總成績評量為 %s",level);
		}if(average >= 60 && average <= 70) {
			level = "D";
			System.out.printf("總成績評量為 %s",level);
		}if(average <60) {
			level = "E";
			System.out.printf("總成績評量為 %s",level);
		}
		keyin.close();
	}
}
/*
 * 使用者輸入期中考(30%)、期末考(30%)、以及平時成績(40%)後，
 * 系統會依學期總平均評量其等級，
 * 如學期總成績高於 90 分則輸出 A 級、
 * 80 ~ 90 分為 B 級、
 * 80 ~ 70 為 C 級、
 * 70 ~ 60 為 D 級，
 * 60 分以下為 E 級。
 * */
 