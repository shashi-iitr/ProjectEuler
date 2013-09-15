package problems;
public class P25ThousandDigFib {
	public static void main(String[] args){
		int n=10, i;
		/*boolean found = false;
		for(i=1; i<1000000 && found == false; i++){
			int b=fib(i);
			int count=0;
			while(b>0){
				count++;
				b=b/10;
			}
			if(count==n){
				System.out.print(i+"  ");
				found = true;
			}
		}
		System.out.print(i+"  ");*/
		
		
		
		/*int ci=1;
		
		int [] A=new int [n+1];
		A[1]=1;
		for(int j=1; j<=n; ){
			while(ci<3){
			int carry=0;
			for(int k=1; k<=ci; k++){
				A[k]=A[k]*(j)+carry;
				carry=(int) A[k]/10;
				A[k]=A[k]%10;
			}
			
			while(carry>0){
				ci++;
				A[ci]=carry%10;
				carry=carry/10;
			}
			j++;
		}System.out.print(j);
		break;
	}*/
		
		
		
		int cii=1;
		
		int [] D=new int [n+1];
		int [] B=new int [n+1];
		int [] C=new int [n+1];
			
		B[1]=0; C[1]=1;
		for(int p=1; p<=n; p++){
			int carry=0;
			
			for(int s=1; s<=cii; s++){
				D[s]=B[s]+C[s]+carry;
				carry=D[s]/10;
				D[s]=D[s]%10;
				B[s]=C[s];
				C[s]=D[s];
			}
			while(carry>0){
				cii++;
				D[cii]=carry%10;
				carry=carry/10;
			}
		}
	}

	
	static int fib(int i){
		if(i==0)
			return 0;
		if(i==1)
			return 1;
		return fib(i-2)+fib(i-1);
	}
}
