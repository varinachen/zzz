package zzz0915;
import java.io.*;

public class Ex2_6 {
	public static void main(String[]args) throws IOException{
		//練習標準鍵盤輸入 - java.io中的BufferedReader 類別
		//readLine()功能：一次讀取一行資料
		String name;
		int value;
		BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
		//InputStreamReader是一個讀取輸入串列的物件，引用名為「系統輸入」(System.in 即是鍵盤)的物件。
		//範例：捐款收據
		System.out.printf("請輸入先生/小姐姓名\t=>");
		name = keyin.readLine();
		System.out.printf("請輸入捐款金額\t=>");
		value = Integer.parseInt(keyin.readLine());//將由鍵盤輸入的字串，轉換成整數
		System.out.printf("收據如下:\n\n");
		System.out.println("***  ooxx  捐款收據   ***\n");
		System.out.printf("感謝 %s 先生/小姐贊助\n", name);
		System.out.printf("\t捐款 %d 元整\n\n", value);
		System.out.println("***  *** *** *** *** ***");			
	}
}
