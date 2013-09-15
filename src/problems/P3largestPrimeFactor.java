/* completed
 * The prime factors of 13195 are 5, 7, 13 and 29
What is the largest prime factor of the number 600851475143 ?
 */
package problems;

public class P3largestPrimeFactor {

	public static void main(String[] args) {

		long  N= 600851475143l;
		double NSqr=Math.sqrt(N);
		long a=N;
		int maxPm=0 ,i;
		for(i=2; i<=NSqr && a>1; i++){
			while(a%i==0){
				a=a/i;
				maxPm=i;
			}
		}
		System.out.println(maxPm);
	}
}
