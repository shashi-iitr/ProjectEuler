/* submitted
 * Surprisingly there are only three numbers that can be written as the sum of 
 * fourth powers of their digits:
    1634 = 1^4 + 6^4 + 3^4 + 4^4
    8208 = 8^4 + 2^4 + 0^4 + 8^4
    9474 = 9^4 + 4^4 + 7^4 + 4^4
As 1 = 14 is not a sum it is not included.
The sum of these numbers is 1634 + 8208 + 9474 = 19316.
Find the sum of all the numbers that can be written as the sum of 
fifth powers of their digits
 */

package problems;

public class P30DigitFifthPower {

	public static void main(String[] args){
		int  d=9, e=5, sumN=0;
		for( int i=2; i<10000000; i++){
			int k=i;
			int [] A=new int [d];
			for(int j=0; j<d; j++){
				A[j]=k%10;
				k=k/10;
			}
			int sum=0;
			for(int j=0; j<d; j++){
				sum=(int) (sum+Math.pow(A[j], e));
			}
			if(sum==i){
				System.out.print(i+" ");
				sumN+=i;
			}
		}
		System.out.print("  sum=  "+ sumN);
	}
}
