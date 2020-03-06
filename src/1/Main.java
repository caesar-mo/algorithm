import java.util.Scanner;
/*
 * Watching the problem : https://www.acmicpc.net/problem/1712
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int st = sc.nextInt();
		int dy = sc.nextInt();
		int sr = sc.nextInt();
		int tp = -1;
		
		if(dy<sr)
			tp = st/(sr-dy) + 1;
		
		System.out.println(tp);
	}

}