/* complete
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, 
we can see that the 6th prime is 13.
What is the 10001st prime number?
*/

package problems;

public class P7nthPrime {

	
	public static void main(String[] args) {
		int i = 2, n=10001;
		int count = 0;
		while (count < n) {
			if (isPrime(i)) {
				count++;
			}
			i++;
		}
		System.out.print(--i);
	}
	
	static Boolean isPrime(int a) {
		int sqra = (int) Math.sqrt(a);
		for (int i = 2; i <= sqra; i++) {
			if (a % i == 0)
				return false;
		}
		return true;
	}
}
