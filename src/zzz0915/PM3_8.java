package zzz0915;
import java.util.Scanner;

public class PM3_8 {
	public static void main(String[]args) {
		//憂鬱症自我診斷工具
		Scanner keyin = new Scanner(System.in);
		int a,b,c,d,e,f,g,h,i,j;
		final int a1 = 5;
		final int b1 = 4;
		final int c1 = 5;
		final int d1 = 3;
		final int e1 = 2;
		final int f1 = 3;
		final int g1 = 4;
		final int h1 = 2;
		final int i1 = 3;
		final int j1 = 5;
		int sum;//公式一：以總和分數判斷
		float sum1;//公式二：乘以加權比重後的總和，再除以加權的總和
		int weights = a1+b1+c1+d1+e1+f1+g1+h1+i1+j1;
	
		System.out.println("*** 憂鬱症自我診斷系統 ***");
		System.out.printf("請依序回答下列問題，相似度(0-10)\n\n");
		System.out.printf("不明顯(0),稍明顯(2),明顯(6),很明顯(10)\n");
		
		System.out.printf("我常覺得想哭(比重5)=>");
		a = keyin.nextInt();
		System.out.printf("我覺得心情不好(比重 4)=>");
		b = keyin.nextInt();
		System.out.printf("我覺得比以前更容易發脾氣(比重 5)=>");
		c = keyin.nextInt();
		System.out.printf("我睡不好(比重 3)=>");
		d = keyin.nextInt();
		System.out.printf("我覺得不想吃東西(比重 2)=>");
		e = keyin.nextInt();
		System.out.printf("我覺得想事情或做事情比以前慢(比重 3)=>");
		f = keyin.nextInt();
		System.out.printf("我比較會往壞的方向想(比重 4)=>");
		g = keyin.nextInt();
		System.out.printf("我覺得身體不舒服(比重 2)=>");
		h = keyin.nextInt();
		System.out.printf("我覺得自己很沒用(比重 3)=>");
		i = keyin.nextInt();
		System.out.printf("我很想不開，甚至想死(比重 5)=>\n");
		j = keyin.nextInt();
		
		sum = a+b+c+d+e+f+g+h+i+j;
		System.out.printf("總合計算(0-100),判斷結果：正常(0-30)\n");
		System.out.printf(" 輕微憂鬱症(30-60),明顯憂鬱症(60-100)\n");
		System.out.printf("您的憂鬱症指數為 => %d\n\n",sum);
		
		sum1 = (float)(a*a1+b*b1+c*c1+d*d1+e*e1+f*f1+g*g1+h*h1+i*i1+j*j1)/weights;
		System.out.printf("加權指數計算(0-10),判斷結果：正常(0-3)\n");
		System.out.printf(" 輕微憂鬱症(3-6),明顯憂鬱症(6-10)\n");
		System.out.printf("您的憂鬱症指數為 => %.2f\n",sum1);
		keyin.close();
	}
}
