/* complete
 * The sum of the squares of the first ten natural numbers is,

12 + 22 + ... + 102 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten 
natural numbers and the square of the sum is 3025  385 = 2640.

Find the difference between the sum of the squares of the first one 
hundred natural numbers and the square of the sum.
 */

package problems;

public class P6SumSqrDif {

	public static void main(String[] args) {
		int n = 100;
		int sum=0;
		int[] p = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			p[i] = i * i;
			p[0] = p[0] + p[i];
			sum=sum+i;
		} sum*=sum;
		System.out.println("diff= "+ (sum-p[0]));
	}
}
