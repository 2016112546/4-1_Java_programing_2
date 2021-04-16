import java.util.Scanner;

public class Main {

	public static int self(int n) {
		int count = 0 ; // �Ҽ��� �ƴ� ���� ���� 
		int result =n-1; //���ϴ� ���� ����
		for(int i=n+1;i<2*n;i++) { // n+1 ���� n-1���� ������.
			for(int j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0) { // �Ҽ� �ƴѰ� ���ý� 
					count ++ ;  // �Ҽ��� �ƴ� �͵�  �߰��ϱ� 
					break; // �ݺ��� ������ 
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
