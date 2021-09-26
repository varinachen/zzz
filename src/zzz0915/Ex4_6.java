package zzz0915;
import java.util.*;

public class Ex4_6 {
	public static void main(String[]args) {
		//switch/case 選擇分歧：當某一條件成立時，則執行該條件下(case)的敘述區塊，執行完畢後，並不立即結束該敘述，而會繼續測試下一個條件(此功能與 if/else 不同)，
		//也會執行下一條件的敘述。
		//範例：多功能計算製作
		Scanner keyin = new Scanner(System.in);
		float v1;
		float v2;
		String oper_st;//運算子
		char oper;//之後把運算子從字串中取出
		float result = 0F;
		System.out.println("== 歡迎使用 + - * / % 計算器 ==");
		System.out.printf("請輸入(如:25+32)=>");
		v1 = keyin.nextFloat();//讀入第一個值
		oper_st = keyin.next();//用字串格式讀入運算子
		oper = oper_st.charAt(0);//取出 oper_st 字串內第 0 個字元，存放於 oper 變數內。其中 charAt()為字元取出方法。
		v2 = keyin.nextFloat();//讀入第二個值
		switch(oper) {
			case '+':
				result = v1 + v2;
				break;
			case '-':
				result = v1 - v2;
				break;
			case '*':
				result = v1 * v2;
				break;
			case '/':
				result = v1 / v2;
				break;
			case '%':
				result = v1 % v2;
				break;
			default:
				System.out.printf("錯誤輸入\n");
			
		}
		System.out.printf("%.2f%s%.2f=%.2f", v1,oper_st,v2,result);	
		keyin.close();
	}
}