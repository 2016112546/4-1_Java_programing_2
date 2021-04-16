import java.util.Scanner;

public class Main {

	public static boolean[] basic(int n) { // ��� ���ϱ� 
		boolean arr[] = new boolean [n+1]; 
		arr[n]=true;
		for(int i=1; i<=n/2;i++) { //1���� �����ؼ� n/2 ���� ���ϱ� 
			if(n%i==0)
			arr[i]=true;
		}
		return arr;
	}


	public static int soinsu(int n) {
		for(int i=2; i<=n;i++){
			while(n%i==0) {
				System.out.print(i+" ");
				n=n/i;
			}
		}
		return 0;
	}
	
	public static int gcd (int a, int b ,int c) {
		int result =1;
		for(int i=2 ;i<a;i++) {
			while(a%i==0 && b%i==0 && c%i==0) {
				result*=i;
				a=a/i;
				b=b/i;
				c=c/i;
			}
			
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		/*basic(n);
		for(int i=0 ;i<=n;i++) {
			if(basic(n)[i])
			System.out.print(i+" ");
		}
		*/
		
		// soinsu(n); ���μ� ���� ���ϱ� 
		
		// �ִ� ����� ���ϱ� 
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println(gcd(a,b,c));
	}

}
