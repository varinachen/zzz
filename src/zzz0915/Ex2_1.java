package zzz0915;

public class Ex2_1 {
	public static void main(String[]args) {
		// 練習列印出各種資料型態的數值，並說明變數的功能為何
		short count = 10;
		System.out.println("我是短整數 short count="+count+"，可以當作計數器");
		int number = 20;
		System.out.println("我是整數 int number="+number+"，可以當作整數運算");
		long value = 300;
		System.out.println("我是長整數 long value="+value+"，可以存放較大的整數");
		float cost = 40.2f; //有小數點的數值預設視為double型態，所以要多加f/F表示為float型態
		System.out.println("我是浮點數 float cost="+cost+"，可以表示存放有小數點數值");
		double weight = 500.34;
		System.out.println("我是雙倍浮點數 double weight="+weight+"，可以存較為精密的數值");
		char key = 'A'; // char型態：數值只能輸入一個字元，而且得用單引號('A')包起來。
		System.out.println("我是字元 char key="+key+"，可以做字元比較或測試");
		char mykey = 91; //char型態：輸入ASCII碼也會有值？
		System.out.println("我是字元 char mykey="+mykey);		
		boolean flag = true; //
		System.out.println("我是布林 boolean flag="+flag+"，可以做事件發生的旗標");
		String name = "x OO";
		System.out.println("我是字串 String name="+name+"，可以當文字串列使用");
		
		
		
		
	}
}
