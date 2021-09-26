package zzz0915;
import java.util.Scanner;

public class PM3_3 {
	public static void main(String[]args) {
		//記錄棒球打擊率 (可以連續輸入兩次比賽，之前打擊次數為50、安打數為15支。)
		//打擊率＝安打次數/打擊次數
		
		//擴充紀錄「長打率」功能：壘打數/打擊次數
		//假設目前打擊累積次數為50、壘打次數為30
		Scanner keyin = new Scanner(System.in);
		int total = 50;//設定打擊累積次數
		int hits = 15;//安打累積次數
		float batting = (float)total/hits;//打擊率
		int numbers;//每場打擊次數
		int bingles;//安打次數

		int base = 30;//壘打次數
		float op = (float)base/total;//長打率公式
		
		System.out.println("**** 記錄棒球打擊率工具 ****");
		batting = (float)hits/total;
		System.out.printf("目前打擊=%d數 安打=%d支、打擊率是%.4f 長打率為%.1f\n", total, hits,batting,op);
		System.out.printf("請輸入第一場(打擊次數 安打次數)");
		numbers = keyin.nextInt();
		bingles = keyin.nextInt();
		total = total + numbers;
		hits = hits + bingles;
		batting = (float)hits/total;
		op = (float)base/total;
		System.out.printf("目前出場=%d數 安打=%d支、打擊率是%.4f 長打率為%.1f\n", total,hits,batting,op);
		System.out.printf("請輸入第二場(打擊次數 安打次數)");
		numbers = keyin.nextInt();
		bingles = keyin.nextInt();
		total = total + numbers;
		hits = hits + bingles;
		batting = (float)hits/total;
		op = (float)base/total;
		System.out.printf("目前出場=%d數 安打=%d支、打擊率是%.4f 長打率為%.1f\n",total,hits,batting,op);
		keyin.close();

	}
}
