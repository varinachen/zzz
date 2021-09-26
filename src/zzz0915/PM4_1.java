package zzz0915;
import java.util.Scanner;

public class PM4_1 {
	public static void main(String[]args) {
		//順序性敘述-規劃客戶資料
		String name;
		int sex;//0=女性，1=男性
		int age;
		String address;
		float tall;
		float weight;
		Scanner keyin = new Scanner(System.in);
		System.out.printf("請輸入客戶姓名 =>");
		name = keyin.next();
		System.out.printf("請輸入客戶性別(男:1,女:0)=>");
		sex = keyin.nextInt();
		System.out.printf("請輸入客戶年齡=>");
		age = keyin.nextInt();
		System.out.printf("請輸入客戶地址=>");
		address = keyin.next();
		System.out.printf("請輸入客戶身高=>");
		tall = keyin.nextFloat();
		System.out.printf("請輸入客戶體重=>");
		weight = keyin.nextFloat();
		
		System.out.println("\n列印客戶資料如下：\n");
		System.out.printf("客戶姓名 = %s\n",name);
		//System.out.printf("   性別 = %s(1:男 0:女)\n", sex);
		if(sex == 1)
			System.out.printf("   性別 = 男性\n");
		else
			System.out.printf("   性別 = 女性\n");
		System.out.printf("   年齡 = %s\n", age);
		System.out.printf("   地址 = %s\n", address);
		System.out.printf("   身高 = %.2f\n", tall);
		System.out.printf("   體重 = %.2f\n", weight);
		keyin.close();

	}
}
