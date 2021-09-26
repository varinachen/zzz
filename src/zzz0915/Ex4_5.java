package zzz0915;
import java.util.Scanner;

public class Ex4_5 {
	public static void main(String[]args) {
		//醫療診斷推論系統
		Scanner keyin = new Scanner(System.in);
		
		String answer;
		System.out.println("歡迎使用醫療診斷系統，請依序回答問題");
		System.out.println("==============================");
		System.out.printf("請問您最近是否發燒 (y/n)=>");
		answer = keyin.nextLine();
		if (answer.equals("y") ) {
			System.out.printf("請問您最近是否咳嗽 (y/n)=>");
			answer = keyin.nextLine();
			if(answer.equals("y")) {
				System.out.printf("請問您最近是否感覺疲倦 (y/n)=>");
				answer = keyin.nextLine();
				if(answer.equals("y")) {
					System.out.printf("先生/小姐您已經感冒了!!!");
				}else {
					System.out.printf("請問您是否血壓升高 (y/n)=>");
					answer = keyin.nextLine();
					if(answer.equals("y")) {
						System.out.printf("請問您最近是否口乾 (y/n)=>");
						answer = keyin.nextLine();
						if(answer.equals("y")) {
							System.out.printf("先生/小姐您可能得肝病!!!");
						}else 
								System.out.printf("有可能只是感冒而已???");						
					}
					else {
						System.out.printf("請問您最近是否盜汗 (y/n)=>");
						answer = keyin.nextLine();
						if(answer.equals("y")) {
							System.out.printf("先生/小姐您可能得肺病!!!");
						}else 
							System.out.printf("需要進一步檢查!!!");						
					}
				}
			}
			else
				System.out.printf("有發燒無咳嗽，請到別科門診!!!");
		}
		else
			System.out.printf("應該是健康的身體");
		keyin.close();
	}
}
