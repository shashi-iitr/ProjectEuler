/*Submitted  
145 is a curious number, as 1! + 4! + 5! = 1 + 24 + 120 = 145.
Find the sum of all numbers which are equal to the sum of the factorial of their digits.
Note: as 1! = 1 and 2! = 2 are not sums they are not included.
*/
package problems;

public class P34DigitFactorial {

	public static void main(String[] args){
		int n=1000000000;
		for(int i=3; i<=n; i++){
			
			int j=0, count=0;
			int N=i;
			
			while(N>0){
				N=N/10;
				count++;
			}
			int l=i;
			int [] A=new int [count];
			while(l>0){
				A[j]=l%10;
				l=l/10;
				j++;
			}
			int sum=0;
			int k=0;
			while(k<count){
				int b=factorial(A[k]);
				sum=sum+b;
				k++;
			}
			if(sum==i)
				System.out.print(i+" ");
			
		}
	}
	
	static int factorial(int f){
		if(f==1)
			return 1;
		if(f==0)
			return 1;
		
		return f*factorial(f-1); 
	}
}
