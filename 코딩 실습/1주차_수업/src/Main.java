import java.util.Scanner;




public class Main {

	// �밡�ٷ� �Ҽ� ���ϱ� 
	public static boolean basic(int n) {
		boolean result = true ;
		for(int i=2 ; i<(int)Math.sqrt(n);i++) {
			if(n%i==0) {
				result= false ; 
				break;
			}
		}
		return result;
	}

	
	// �����佺ü�� �Ҽ� ���ϱ�  
	public static boolean[] eratos(int n) { 
		boolean[] arr = new boolean[200];
		for (int i = 2 ; i<=n;i++) {
			arr[i]=true;
		}
		
		for(int i =2 ; i<=Math.sqrt(n);i++) {
			if(arr[i]) {
				// i �� ����� ���� 
				for(int j=i*i;j<n ; j+=i) {
					arr[j]=false;
				}
			}
		}
		
		return arr ; 
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("�Ҽ� �Ǻ��� ");
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		// �밡�� �Ҽ� �Ǻ� 
		if(basic(n))
			System.out.println(n+ " �� �Ҽ� ");
		else 
			System.out.println(n +  "�� �ռ��� ");
	
		System.out.println();
	
		//�����佺 �Ҽ� �Ǻ� 
		if(eratos(n)[n])
			System.out.println(n+ " �� �Ҽ� ");
		else 
			System.out.println(n +  "�� �ռ��� ");
		
		System.out.println();
		//�����佺 �̿� �� �ȿ� �Ҽ� ��� ���ϱ� 
		for(int i=0;i<=n;i++) {
			if(eratos(n)[i])
				System.out.print(i+"  ");
		}
		
	}
		
	

}
