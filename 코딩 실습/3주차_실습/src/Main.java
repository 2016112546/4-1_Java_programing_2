import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int i =0 , flag = 0 ;
		
		while(true) {
			i=sc.nextInt();
			if(i==13)
				break;
			flag=flag | (1<<(i-1));
			System.out.printf("%03x\n",flag);
		}
		System.out.println("비트 설정 종료 ");
		sc.close();
		
	}

}
