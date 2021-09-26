package zzz0915;
import java.util.*;
import java.io.*;

public class PM4_3 {
	public static void main(String[]args) throws IOException{
		//擲骰子遊戲
		BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
		Random random = new Random();
		String player1;//玩家姓名
		String player2;
		int dot1;
		int dot2;
		int dot3;
		int value1;
		System.out.println("請輸入第一位玩家的姓名(開始擲骰子)=>");
		//player1 = keyin.next();	
		player1 = keyin.readLine();
		dot1 = 1 + random.nextInt(6);//+1不會擲出0這個數字
		dot2 = 1 + random.nextInt(6);
		dot3 = 1 + random.nextInt(6);
		value1 = dot1 + dot2 + dot3;
		System.out.printf("%s 先生/小姐擲骰子是 %d %d %d 合計 = %d\n", player1,dot1,dot2,dot3,value1);

		System.out.println("請輸入第二位玩家的姓名(開始擲骰子)=>");
		//player2 = keyin.next();
		player2 = keyin.readLine();
		int dot4 = 1 + random.nextInt(6);
		int dot5 = 1 + random.nextInt(6);
		int dot6 = 1 + random.nextInt(6);
		int value2 = dot4 + dot5 + dot6;
		System.out.printf("%s 先生/小姐擲骰子是 %d %d %d 合計 =%d\n", player2,dot4,dot5,dot6,value2);
		if (value1>=value2) {
			System.out.printf("恭喜 %s 先生/小姐贏得此局", player1);
		}
		else {
			System.out.printf("恭喜 %s 先生/小姐贏得此局", player2);
		}
		keyin.close();
	}
}
