/*completed 
n! means n × (n − 1) × ... × 3 × 2 × 1

For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

Find the sum of the digits in the number 100!*/


package problems;

public class P20SumDigFact {

	public static void main(String[] args) {

		int m=100, n=5000, ci=1, i=1; 
		long []A=new long [n];
		A[1]=1;
		for(int j=1; j<=m; j++){
			int carry=0;
			for(int k=1; k<=ci; k++){
				A[k]=A[k]*i +carry;
				carry=(int) (A[k]/10);
				A[k]=A[k]%10;
			}
			i++;
			while(carry>0){
				ci++;
				A[ci]=carry%10;
				carry=carry/10;
			}
		}
		long sum=0;
		for(int k=ci; k>0; k--){
			sum=sum+A[k];
			System.out.print(A[k]);
		}
		System.out.print("\n\n"+sum);
	}
}
