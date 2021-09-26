package zzz0915;

import java.util.Scanner;
public class PM3_7 {
	public static void main(String[]args) {
		Scanner keyin = new Scanner(System.in);
		//登革熱診斷系統(二)：變更計算公式：((a*x*x+b*y*y+c*z*z+d*k*k)/(a+b+c+d))開根號
		int x;//發高燒（比重 a = 6)
		int y;//筋骨痠痛(比重 b = 3)
		int z;//感冒症狀(比重 c = 8)
		int k;//貪睡症狀(比重 d = 3)
		//float total;
		final int a = 6;//比重採固定值 加final
		final int b = 3;
		final int c = 8;
		final int d = 3;
		double total1;
		int weights = a + b + c + d;//相加各個症狀的比重
		System.out.println("*** 登革熱自我診斷系統 ***");
		System.out.printf("請依照程式詢問步驟，輸入各種症狀明顯度如何 (0~10)\n");
		System.out.printf("\t如：不明顯(0),稍明顯(4),明顯(6),很明顯(10)\n");
		System.out.printf("請輸入發燒症狀明顯否(0~10) =>");
		x = keyin.nextInt();
		System.out.printf("請輸入筋骨痠痛症狀明顯否(0~10) =>");
		y = keyin.nextInt();
		System.out.printf("請輸入感冒症狀明顯否(0~10) =>");
		z = keyin.nextInt();
		System.out.printf("請輸入貪睡症狀明顯否(0~10) =>");
		k = keyin.nextInt();
		total1 = Math.sqrt((a*x*x+b*y*y+c*z*z+d*k*k)/(double)weights);
		System.out.println(total1);
		System.out.printf("\n您感染登革熱指數為(0~10) =%.2f\n",total1);
		keyin.close();		
	}
}
