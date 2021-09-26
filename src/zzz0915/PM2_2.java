package zzz0915;

public class PM2_2 {
	public static void main(String[]args) {
		//印出購物清單
		String name1 = "酥餅";
		String name2 = "脆笛酥";
		int amount1 = 50;
		int amount2 = 30;
		int price1 = 20;
		int price2 = 100;
		int sum1 = amount1*price1;
		int sum2 = amount2*price2;
		System.out.printf("品名\t數量\t單價\t小計\n");
		System.out.printf("===========================\n");
		System.out.printf("%s\t%d\t%d\t%d\n",name1,amount1,price1,sum1);
		System.out.printf("%s\t%d\t%d\t%d\n",name2, amount2,price2,sum2);
		System.out.printf("===========================\n");
		System.out.printf("總計 = %d\n",sum1+sum2);
	}
}
