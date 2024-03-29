/*
 * Each new term in the Fibonacci sequence is generated by adding
the previous two terms. By starting with 1 and 2, the first 10 terms will be:
1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
By considering the terms in the Fibonacci sequence whose values do not exceed four million, 
find the sum of the even-valued terms.
 */

package problems;

public class P2evenFibonacci {

	public static void main(String[] args) {
		int N= Integer.parseInt(args[0]);
		int sum=0;
		int n2=0;
		int n1=1;
		int n=n1+n2;
		while(n < N){
			n2=n1;
			n1=n;
			if(n%2==0){
				sum+=n;
				System.out.print(n + ". ");
			}
			n=n1+n2;
		}
		System.out.println("\n \n"+ sum);
	}
}
