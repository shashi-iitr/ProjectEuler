/*
 * A Pythagorean triplet is a set of three natural numbers, a  b  c, for which
a^2 + b^2 = c^2
For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
 */
package problems;

public class P9Pythagorean {
	public static void main(String[] args) {
		int n = 1000, x = 0, a = 0, b = 0, c = 0;
		for (c = n / 3; c < n / 2; c++) {
			x = 1000 - c;
			for (b = 1; b <= x/2; b++) {
				a = x - b;
				if (isTriplet(a, b, c) && isSum(a, b, c, n)) {
					System.out.println(a * b * c+"\n");
					System.out.print(a + " " + b + " " + c);
					System.exit(0);
				}
			}
		}
	}

	
	static Boolean isTriplet(int a, int b, int c) {
		if (a * a + b * b == c * c)
			return true;
		return false;
	}

	
	static Boolean isSum(int a, int b, int c, int n) {
		if (a + b + c == n)
			return true;
		return false;
	}

}
