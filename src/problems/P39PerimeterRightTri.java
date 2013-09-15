/*submitted 
If p is the perimeter of a right angle triangle with integral length sides, {a,b,c}, 
there are exactly three solutions for p = 120.
{20,48,52}, {24,45,51}, {30,40,50}
For which value of p ≤ 1000, is the number of solutions maximised?
 */

package problems;

public class P39PerimeterRightTri {

	public static void main(String[] args){
		int m=1000;
		int []D=new int [m+1];	
		for(int i=12; i<=m; i++){
			int [] A=new int [i];
			int []B=new int [i];
			
			for(int j=2; j<i; j++){
				A[j]=j;
				B[j]=A[j]*A[j];
			}
			int count=0;
			for(int k=4; k<i; k++){
				int p=2, n=k-1;
				while(p<n){
					if(B[p]+B[n]==B[k] && p+n+k==i){
					System.out.print(B[p]+" "+ B[n]+" "+B[k]+" ");
					count++;
					p++; n--;
					}
					else if(B[p]+B[n]>B[k])
						n--;
					else 
						p++;
				}
				D[i]=count;
			}
			
			
		}
		int max=D[12];
		for(int f=13; f<=m; f++){
			if(max<D[f])
				max=D[f];
		
		}
		int h=12;
		while(D[h]<max){
			h++;
		}
		System.out.println("\n"+h);
	}
}
