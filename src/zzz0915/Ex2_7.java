package zzz0915;
import java.util.Scanner;

public class Ex2_7 {
	public static void main(String[]args){
		//練習掃描鍵盤輸入 - Scanner
		//功能：一次輸入多個資料，再敲入Enter鍵，系統再分別讀入
		//範例-登錄客戶資料：要求輸入客戶資料後，再印出輸入結果。
		Scanner keyin = new Scanner(System.in);
		System.out.printf("請輸入客戶資料(姓名 年齡 消費金額)=>");
		String name = keyin.next();
		int age = keyin.nextInt();
		double price = keyin.nextDouble();	
		System.out.printf("客戶資料如下：\n\n");
		System.out.printf("客戶姓名:%s\n",name);
		System.out.printf("客戶年齡：%d\n",age);
		System.out.printf("消費金額：%.2f\n", price);	
		keyin.close();

		}
	}
