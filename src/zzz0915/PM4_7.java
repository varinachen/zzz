package zzz0915;
import java.util.Scanner;

public class PM4_7 {
	public static void main(String[]args) {
		//數字轉換國字程式
		Scanner keyin= new Scanner(System.in);
		String number;
		//int number;//也可以用int作sitch的判斷條件
		//String chinese;//印出相對的數字國字，就不用再轉成字元才去判斷
		char value;
		System.out.println("== 歡迎使用數字轉換國字系統 ==");
		System.out.printf("請輸入一個整數數字=>");
		number = keyin.next();
		//number = keyin.nextInt();
		value = number.charAt(0);
		switch(value) {
		case '1':
			System.out.printf("1<=>壹");
			break;
		case '2':
			System.out.printf("2<=>貳");
			break;
		case '3':
			System.out.printf("3<=>參");
			break;
		case '4':
			System.out.printf("4<=>肆");
			break;
		case '5':
			System.out.printf("5<=>伍");
			break;
		case '6':
			System.out.printf("6<=>陸");
			break;
		case '7':
			System.out.printf("7<=>柒");
			break;
		case '8':
			System.out.printf("8<=>捌");
			break;
		case '9':
			System.out.printf("9<=>玖");
			break;
		case '0':
			System.out.printf("0<=>零");
			break;
		default:
			System.out.printf("輸入錯誤\n");
		}
		keyin.close();
				
	}
	
}
