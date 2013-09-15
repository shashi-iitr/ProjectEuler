//

package problems;

public class P14longestCollatz {
	static int count=0;
	public static void main(String [] args){
		int N=999999, m=count, greatI=0;
		for(int i=2; i<=N; i++){
			count=0;
			int chainCount=getChainCount(i);
			if(m<count){
				m=count;
				greatI=i;
			}
		}
		System.out.println("\n \n"+ greatI);
	}
	
	
	static int getChainCount(int n) {
		count++;
		System.out.print(n+"  ");
		while (n > 1) {
			if (n % 2 == 0) {
				n = even(n);
			}
			if(n==1){
				break;
			}
			n = odd(n);
		}
		System.out.println ("\n count= "+count+"\n \n" );
		return count;
	}

	
	static int even(int n) {
		while (n % 2 == 0) {
			n = n / 2;
			System.out.print(n + "  ");
			count++;
		}

		return n;
	}

	
	static int odd(int n) {
		n = 3 * n + 1;
		System.out.print(n + "  ");
		count++;
		return n;
	}
}
