package zzz0915;
import java.io.*;

public class PM2_4 {
	public static void main(String[]args) throws IOException {
		//加油站計費
		BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
		float price=28.50f;
		//final double price =28.5; //final 變數內容不可更改
		int l;
		float sum;
		//double l,sum;
		System.out.printf("目前95無鉛汽油每公升 %.2f 元\n", price);
		System.out.printf("請輸入加油數量 =>");
		l = Integer.parseInt(keyin.readLine());
		//l = Double.parseDouble(keyin.readLine());//把鍵盤輸入的字串轉成雙倍精準數
		sum = l*price;		
		System.out.printf("應收金額 =>%.0f",sum);//.0 捨棄小數點
	}
}
