package problems;

public class P25fibdigit {

	public static void main(String[] args) {
		int n = 25, m=0, i, ci=1, count=1;
		int []A=new int[n+1];
		int []B=new int[n+1];
		int []C=new int[n+1];
		int[] fib = new int[n + 1];
		fib[1] = 1;
		fib[2] = 1;
		System.out.println(fib[1] + "\n" + fib[2]);

		for (i = 3; i <= n; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
			System.out.println(fib[i]);
			m=fib[i]/10;
			
		}
	}
}
