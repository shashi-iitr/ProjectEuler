package problems;
public class RotatingMatrix {
	public static void main(String[] args) {
		
		int [][]B = {{1,2,3},{4,5,6},{7,8,9}};
		int [][]D = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		int [][]C = rotateMatrix(B, 3);
		int [][]E = rotateMatrix(D, 4);
		
		printArray(B, 3);
		System.out.println();
		printArray(C, 3);
		System.out.println("\n\n");

		printArray(D, 4);
		System.out.println();

		printArray(E, 4);
	}
	
	
	static int [][] rotateMatrix(int [][]A,int n){
		int [][]B=new int[n][n];
		//int [][]B = {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				
				B[j][n-i-1]=A[i][j];
				
			}
				
		}
		
		
		return B;
	}
	
	
	static void printArray(int [][]A, int n){
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++)
				System.out.print(A[i][j]+"\t");
			System.out.print("\n");
		}
	}
}