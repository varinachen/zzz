package zzz0915;
import java.util.Scanner;

public class Ex4_1 {
	public static void main(String[]args) {
		//順序性敘述-超商列印購買清單
		int coke = 15;
		int bread = 45;
		int wine = 312;
		int value1;
		int value2;
		int value3;
		int sum1;
		int sum2;
		int sum3;
		int total=0;
		Scanner keyin = new Scanner(System.in);
		System.out.printf("百事可樂(每瓶 15 元)購買數量 =>");
		value1 = keyin.nextInt();
		sum1 = value1*coke;
		System.out.printf("美味麵包(每個 45 元)購買數量 =>");
		value2 = keyin.nextInt();
		sum2 = value2*bread;
		System.out.printf("約翰走路(每瓶 312 元)購買數量 =>");
		value3 = keyin.nextInt();
		sum3 = value3*wine;
		total = sum1 + sum2 + sum3;
		System.out.printf("\n");
		System.out.println("*****       列印購物清單       *****");
		System.out.println("----------------------------------");
		System.out.printf("| 品名 \t| 單價\t| 數量\t| 小計\t|\n");
		System.out.println("----------------------------------");
		System.out.printf("|百事可樂\t| %d\t| %d\t| %d\t|\n",coke,value1,sum1);
		System.out.printf("|美味麵包\t| %d\t| %d\t| %d\t|\n",bread,value2,sum2);
		System.out.printf("|約翰走路\t| %d\t| %d\t| %d\t|\n",wine,value3,sum3);
		System.out.println("----------------------------------");
		System.out.printf("| 總計 \t| %d \t     \t    \t|\n",total);
		System.out.println("----------------------------------");		
		keyin.close();
	}
}
