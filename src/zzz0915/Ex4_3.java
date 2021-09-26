package zzz0915;
import java.util.*;

public class Ex4_3 {
	public static void main(String[]args) {
		//if/else 敘述與 Random 亂數產生
		//java.util 套件中的Random類別:
		//乘數練習系統
		Scanner keyin = new Scanner(System.in);
		Random random = new Random();//宣告產生一個 Random 類別的物件，其名稱為 random(如同 int a 的功能)。
		int ran1 = 1 + random.nextInt(9);//接者再產生 Random 類別的屬性(new Random)，並填入 random 物件變數內(如同 int a = 3 之功能)。
		int ran2 = 1 + random.nextInt(9);//+1才不會出現0這個數字
		int value = ran1 * ran2;
		int number;
		System.out.printf("請輸入 %d * %d = ",ran1,ran2);
		number = keyin.nextInt();
		if (number == value) {
			System.out.printf("答對了 您好棒");
		}
		else {
			System.out.printf("答錯了 正確答案是%d，再想想看！",value);
		}
		keyin.close();
	}
}
