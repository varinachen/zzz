package zzz0915;
import java.util.Scanner;

public class PM4_2 {
	public static void main(String[]args) {
		//分歧流程 - if
		//薪資計算系統
		//條件：底薪不可以低於24200元，如低於該值則自動調整到最低薪資;
		//加班時數不得高於 54 小時，高於 54 小時則以 54 小時計算;
		//又加班費為原來時薪再增加 1/3 倍(即是原來時薪的 (1 + 1/3) 倍)。
		//該系統允許輸入 員工姓名、底薪、加班時數，計算完成後，分別印出該員工姓名、底薪、加班費與應領薪資多寡。
		Scanner keyin = new Scanner(System.in);
		String name;
		int base;
		int pay;
		int extra;
		int extra150,extra200,extra250,extra300,extra350;
		int extra_pay;
		
		System.out.printf("請輸入員工姓名 =>");
		name = keyin.next();
		/*輸入底薪，判斷是否低於24200，低於則自動調整到最低薪資*/
		System.out.printf("請輸入底薪 =>");
		base = keyin.nextInt();
		if (base<24200)
			base = 24200;
		
		/*輸入加班時數，判斷是否高於54小時，高於則以54小時計算*/
		System.out.printf("請輸入加班時數 =>");
		extra150 = keyin.nextInt();
		extra200 = keyin.nextInt();
		extra250 = keyin.nextInt();
		extra300 = keyin.nextInt();
		extra350 = keyin.nextInt();
		
		/*
		if (extra>54)
			extra = 54;
		*/
		
		/*計算加班費，以及應領薪資多寡*/
		//extra_pay = (int)((double)base/(30*8)*1.333*extra);//計算時薪時，必須將其轉換成點浮點數，最後結果再轉換回整數，如此計算員工較不會吃虧。
		extra_pay = (int)((double)150*extra150);
		//System.out.println(extra_pay);
		pay  = base + extra_pay;
		//System.out.println(pay);
		
		System.out.println("列印員工薪資如下：\n");
		System.out.printf("員工姓名 = %s\n", name);
		System.out.printf("底薪 = %d\n", base);
		System.out.printf("加班費 = %d\n",extra_pay);
		System.out.printf("本月薪資 = %d\n",pay);	
		keyin.close();

	}
}