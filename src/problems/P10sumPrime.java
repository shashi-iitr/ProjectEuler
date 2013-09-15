/*
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17

Find the sum of all the primes below two million.
 */
package problems;

public class P10sumPrime {

	public static void main(String[] args) {
		int n=4000000;long sum=0;
		for(int i=2; i<=n; i++){
			if(sumPrime(i)){
				sum=sum+i;
			}
				
		}
	System.out.print(sum);
	}
	
	
	static boolean sumPrime(int n){
		/*int [] A=new int [n+1];
		for(int i=0; i<=n; i++){
			A[i]=i;
		}
		long sum=0, j;
		for(int i=0; i<=n; i++){
			if(A[i]!=0 && A[i]!=1){
				for(j=2*i; j<=n; j=j+i){
					A[(int) j]=1;
				}
				sum+=A[i];
			}
		}*/
		
		int sqrn=(int) Math.sqrt(n);
		for(int i=2; i<=sqrn; i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
}
