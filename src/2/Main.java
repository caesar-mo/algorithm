import java.util.Scanner;
/*
 * Watching the problem : https://www.acmicpc.net/problem/2839
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = N%5;
		int result = -1;
		
		while(count % 3 != 0) {
			count = count+5;
		}
		if(N >= count) {
			int count2 = (N-count)/5;
			count = count/3;
			result = count + count2;
		}
		
		System.out.println(result);
	}

}
