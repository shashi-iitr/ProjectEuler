/*completed
Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of 
a and b are called amicable numbers.

For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; 
therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.

Evaluate the sum of all the amicable numbers under 10000.*/


package problems;

public class P21Amicable {
	public static void main(String[] args) {
		
		int m=9999;
		int []A=new int[m+1];
		A[1]=1;
		for(int j=2; j<=m; j++){
			A[j]=dN(j);
		}
		int h=0;
		for(int j=2; j<=m; j++){
			if(dN(A[j])==j && j!=A[j]){
				h=h+j;
				System.out.println("j= "+j+ "  "+"A[j]= "+A[j]);
			}
		}
		System.out.println("\n"+h);
	}

	
	static int dN (int n){
		int sum=0;
		for(int i=1; i<=n/2; i++){
			if(n%i==0)
				sum=sum+i;
		}
		return sum;
	}
	
}
