package zzz0915;

public class Ex2_3 {
	public static void main(String[]args) {
		//練習：電腦內有兩樣產品的名稱、數量、單價，印出產品內容及總和。
		String name1 = "酥餅";
		String name2 = "脆笛酥";
		int amount1 = 20;
		int amount2 = 100;
		int price1 = 50;
		int price2 = 30;
		System.out.print(name1+amount1+"個"+price1+"元/個	 合計 = ");
		System.out.print(price1*amount1+"元");
		System.out.print("\n");
		System.out.print(name2+amount2+"個"+price2+"元/個	 合計 = ");
		System.out.println(amount2*price2+"元");
				
	}
}
