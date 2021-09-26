package zzz0915;

public class Ex5_1 {
	public static void main(String[]args) {
		//從1累加到10
		int count;
		int sum = 0;//累加器初值設定為0
		for(count=1;count<=10;count=count+1) {
			sum = sum + count;//將原來 sum 變數的內容取出與 count 相加後，再存入 sum 變數內。
		}
		System.out.printf("1+2+,,,+10=%d\n", sum);
	}
}

/* for(條件初始;條件判斷;增減量){
 * 		for body
 * 		...}
 * 第一個敘述句為條件變數的初值設定(如 k = 1);
 * 第二個為測試變數內容是否滿足條件(如 k < =10);
 * 第三個敘述句為執行 for 區塊敘述(如 sum = sum + k)後，
   再針對條件變數做增量或減量的變動(如 k = k +1)。
 */