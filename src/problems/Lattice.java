/*completed
Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, 
there are exactly 6 routes to the bottom right corner.
How many such routes are there through a 20×20 grid?*/
		
package problems;

public class Lattice {

	public static void main(String[] args) {
		int n=21, i,j ;
		long [][] A=new long[n][n];
		
		i=n-1;
		for(j=0; j<=n-2; j++){
			A[i][j]=1;
			A[j][i]=1;
		}

		for(i=n-2; i>=0; i--)
			for(j=n-2; j>=0; j--)
				A[i][j]=A[i+1][j]+A[i][j+1];
		
		System.out.print("total paths= "+A[0][0]+"\n\n");
		
		for(i=0; i<n; i++){
			for(j=0; j<n; j++)
				System.out.print(A[i][j]+" \t");
			System.out.println();
		}
	}
}
