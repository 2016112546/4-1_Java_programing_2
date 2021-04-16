import java.util.Scanner;




public class Main {

	// 노가다로 소수 구하기 
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

	
	// 에라토스체로 소수 구하기  
	public static boolean[] eratos(int n) { 
		boolean[] arr = new boolean[200];
		for (int i = 2 ; i<=n;i++) {
			arr[i]=true;
		}
		
		for(int i =2 ; i<=Math.sqrt(n);i++) {
			if(arr[i]) {
				// i 의 배수를 제거 
				for(int j=i*i;j<n ; j+=i) {
					arr[j]=false;
				}
			}
		}
		
		return arr ; 
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("소수 판별법 ");
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		// 노가다 소수 판별 
		if(basic(n))
			System.out.println(n+ " 은 소수 ");
		else 
			System.out.println(n +  "은 합성수 ");
	
		System.out.println();
	
		//에라토스 소수 판별 
		if(eratos(n)[n])
			System.out.println(n+ " 은 소수 ");
		else 
			System.out.println(n +  "은 합성수 ");
		
		System.out.println();
		//에라토스 이용 수 안에 소수 모두 구하기 
		for(int i=0;i<=n;i++) {
			if(eratos(n)[i])
				System.out.print(i+"  ");
		}
		
	}
		
	

}
