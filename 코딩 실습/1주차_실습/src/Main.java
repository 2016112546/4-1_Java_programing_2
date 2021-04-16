import java.util.Scanner;

public class Main {

	public static int self(int n) {
		int count = 0 ; // 소수가 아닌 갯수 새기 
		int result =n-1; //구하는 범위 갯수
		for(int i=n+1;i<2*n;i++) { // n+1 부터 n-1까지 돌린다.
			for(int j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0) { // 소수 아닌거 나올시 
					count ++ ;  // 소수가 아닌 것들  추가하기 
					break; // 반복문 나가기 
				}
			}	
		}
		return result -count ;
	}
	public static int solution(int n) {
		boolean [] arr  = new boolean [2*n];
		for (int i=2 ;i<2*n;i++) {
			arr[i]=true;
		}
		for (int i=2;i<=Math.sqrt(2*n); i++) {
			if(arr[i]) {
				for(int j=i*i;j<2*n;j+=i) {
					arr[j]=false;
				}
			}
		}
		int count =0;
		for(int i=n+1;i<2*n;i++) {
			if(arr[i])
				count++;
		}
		return count ;
	
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(self(n));
		System.out.println(solution(n));
	}

}
