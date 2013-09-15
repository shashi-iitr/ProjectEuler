
package problems;

public class P48SelfPower {

	public static void main(String[] args){
		int n=1000, N=17987;
		int []A=new int [N];
		long b=0;
		for(int i=1; i<=n; i++){
			b+=sum(A, i);
		}
		System.out.println(b);
	
	}
		
	static long sum(int [] A, int h){
		A[1]=1; int ci=1;
		for(int k=1; k<=h; k++){
			int carry=0;
			for(int i=1; i<=ci; i++){
				A[i]=h*A[i]+carry;
				carry=A[i]/10;
				A[i]=A[i]%10;
			}
				
				while(carry>0){
					ci++;
					A[ci]=carry%10;
					carry=carry/10;
				}
		}
		long sum=0;
		for(int i=ci; i>0; i--){
			sum=sum*10+A[i];
			
		}
		System.out.println(sum);
		return sum;
	}
}
