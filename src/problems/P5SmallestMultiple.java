/*
 * 2520 is the smallest number that can be divided by each of the number
 from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of
 the numbers from 1 to 20?
 */
package problems;

public class P5SmallestMultiple {
	public static void main(String[] args) {
		int n = 20;
		int[] num = new int[n + 1];
		for (int i = 1; i < n; i++) {
			int[] pFactor = primeFactor(i);
			for (int j = 2; j <= i; j++) {
				num[j] = max(num[j], pFactor[j]);
			}
		}
		int N = 1;
		for (int j = 2; j < n; j++)
			N = N * pow(j, num[j]);
		System.out.println(N);
	}

	static int pow(int b, int e) {
		int N = 1;
		for (int i = 1; i <= e; i++)
			N = N * b;
		return N;
	}

	static int max(int a, int b) {
		if (a > b)
			return a;
		else {
			return b;
		}
	}

	static int[] primeFactor(int i) {
		int a = i;
		int[] pfactor = new int[a + 1];

		for (int j = 2; j <= i; j++) {
			int count = 0;
			while (a % j == 0) {
				a = a / j;
				count++;
			}
			pfactor[j] = count;
		}
		return pfactor;
	}

}
