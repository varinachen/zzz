package zzz0915;
import java.io.*;

public class PM2_3 {
	public static void main(String[]args) throws IOException{
		//練習簡單加法程式
		int n1;
		int n2;
		int sum;
		BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.printf("請輸入第一個整數 =>");
		n1 = Integer.parseInt(keyin.readLine());
		System.out.printf("請輸入第二個整數 =>");
		n2 = Integer.parseInt(keyin.readLine());
		sum = n1 + n2;
		System.out.printf("%d+%d=%d", n1,n2,sum);
	}
}
