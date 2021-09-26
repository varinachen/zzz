package zzz0915;
import java.io.*;

public class PM2_5  {
	public static void main(String[]args) throws IOException{
		//範例-名片製作軟體：要求輸入名片擁有人的工作單位與姓名與電話，再印出名片。
		BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
		String position;
		String name;
		String tel;
		System.out.printf("請輸入職位名稱 =>");
		position = keyin.readLine();
		System.out.printf("請輸入姓名 =>");
		name = keyin.readLine();
		System.out.printf("請輸入電話 =>");
		tel = keyin.readLine();
		System.out.printf("名片列印如下：\n\n");
		System.out.println("-----------------------------------");
		System.out.printf("台灣遊戲軟體發展協會\n\n");
		System.out.printf("\t%s\n\n",position);
		System.out.printf("\t%s\n\n",name);
		System.out.printf("電話：%s\n\n", tel);
		System.out.println("地址：高雄縣鳥松鄉澄清路 840 號");
		System.out.println("-----------------------------------");	
	
	}
}
