package zzz0915;
import java.util.Scanner;

public class PM4_15 {
	public static void main(String[]args) {
		//業務員薪資計算工具
		String name;
		float sale =0;//銷售額
		int base = 16500;//底薪16500元
		int bonus =0;
		int money =0;
		Scanner keyin = new Scanner(System.in);
		System.out.print("請輸入業務員姓名=>");
		name = keyin.next();
		System.out.print("請輸入業務員銷售金額(萬元)=>");
		sale = keyin.nextInt();
		if(sale<=10) {
			money = base;
		}if(sale>10) {
			sale = (int)(sale - 10)/5;
			System.out.println(sale);
			bonus = (int)sale*5000 + 5000;//超過 10 萬元，給予 5000 元獎金，每增加 5 萬元，給予 5000 元獎金
			money = base + bonus;
		}
		keyin.close();
		System.out.println("列印員工薪資如下：");
		System.out.printf("員工姓名 = %s\n", name);
		System.out.printf("   底薪 = %d\n", (int)base);
		System.out.printf("   獎金 = %d\n", (int)bonus);
		System.out.printf("本月薪資 = %d\n", (int)money);
	}
}
/*
 * 基本薪資(16500元)外，大多採用銷售額來計算獎金多寡，
 * 每月銷售金額 10 萬元以內不給予將金，
 * 超過 10 萬元，給予 5000 元獎金，
 * 以後每增加 5 萬元，給予 5000 元獎金。
 */