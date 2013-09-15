/*
The first two consecutive numbers to have two distinct prime factors are:
14 = 2 × 7  15 = 3 × 5
The first three consecutive numbers to have three distinct prime factors are:
644 = 2² × 7 × 23  645 = 3 × 5 × 43  646 = 2 × 17 × 19.
Find the first four consecutive integers to have four distinct prime factors. 
What is the first of these numbers?
 */

package problems;
public class P47DistinctPrimeFactor {
	public static void main(String[] args){
		int n=1000000;
		int []A=new int [n+1];
		for(int i=0; i<=n; i++){
			A[i]=i;
		}
		
		for(int j=0; j<=n; j++){
			if(A[j]!=1 && A[j]!=0){
				for(int k=2*j; k<=n; k+=j){
					A[k]=1;
				}
			}
		}
		
		int []countArr=new int[n+1];
		for(int i=2; i<=n; i++){
			int l=i, count=0;
			for(int j=0; j<=n; j++){
				
				if(A[j]!=1 && A[j]!=0 && l%j==0){
					while(l%j==0){
						l=l/j;
					}
					count++;
				} 
			}
			
			countArr[i]=count;
			System.out.print(countArr[i]+" ");
		}
		System.out.println();
		for(int i=0; i<=n; i++){
			if(countArr[i]==4)
				if(countArr[i]==countArr[i+1] && countArr[i+1]==countArr[i+2] && countArr[i+2]==countArr[i+3]){
					System.out.println(i+" "+(i+1)+" "+(i+2)+" "+(i+3));
					break;
				}
		}
	}
}
