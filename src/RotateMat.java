public class RotateMat {

	public static void main(String[] args) {

		int [][]A = {{1,2,3},{4,5,6},{7,8,9}};
		int n=3;
		
		int [][]B = rotateMate(A, n);
		printMat(B, n);

		
	     System.out.println("\n");
		
	     int [][]C = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
			int m=4;
			
			int [][]D = rotateMate(C, m);
			printMat(D, m);
	     
	}
	
	
	static void printMat(int [][] P, int n){
		for(int i =0;i <n; i++){
		     for(int j =0 ; j<n;j ++){
		    	 System.out.print(P[i][j]+" ");
		     }
		     System.out.print("\n");
		}
		

		
	}
	
	static int [][] rotateMate(int [][] A , int n){
		  int [][] B = new int [n][n];
		  for(int i =0;i <n; i++){
		     for(int j =0 ; j<n;j ++){
		        B[j][n-i-1] = A[i][j];
		     }
		  }
		  
		  return B;
	}

}
