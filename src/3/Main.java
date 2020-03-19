import java.util.Scanner;
/*
 * Watching the problem : https://www.acmicpc.net/problem/2193
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		long count = 1;
		long result = 1;
		
		if(n > 2) {
			for(int i=1; i<=n-2; i++) {
				result += count;
				count = result-count;
			}
		}
		
		System.out.println(result);
	}

}