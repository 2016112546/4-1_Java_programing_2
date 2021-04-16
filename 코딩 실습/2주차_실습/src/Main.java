import java.util.Scanner;


public class Main {

	public static int gcd(int a, int b) {
		if(b==0)
			return a;
		else
			return gcd(b,a%b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int [n];
		for(int i=0 ; i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=1;i<n;i++) {
			arr[i]=gcd(arr[i-1],arr[i]);
		}
		System.out.println(arr[n-1]);
	}

}
