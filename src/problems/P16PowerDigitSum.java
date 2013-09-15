/* submitted
2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 2^1000?
 */  

package problems;

public class P16PowerDigitSum {

	public static void main(String[] args) {
		
		int m=2, n=11, ci=1;
		int []A=new int[n+1];
		A[1]=1;
		for(int i=1; i<=n; i++){
			
			int carry=0;
			for(int j=1; j<=ci; j++){
				A[j]=A[j]*m+carry;
				carry=A[j]/10;
				A[j]=A[j]%10;
				
			}
			while(carry>0){
				ci++;
				A[ci]=carry%10;
				carry=carry/10;
			}
		}
		int sum=0;
		for(int j=ci; j>0; j--){
			System.out.print(A[j]);
			sum=sum+A[j];
		}
		System.out.print("\n\nsum of the digits is "+ sum);
		
	}
}
