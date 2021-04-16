import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*
		int dec = sc.nextInt();
		sc.close();
		int[] bin = new int[100];
		int cnt = 0 ;
		while(dec !=0) {
			bin[cnt++]= dec%2 ; 
		}
		
		*/
		
		//byte flag = 0b00000110;
		//byte flag = 0x6;
		byte flag = 6;
		if((flag&0b00001000)==0)   //3번째 인덱스가 1이 아니면 0도 미만
			System.out.println("온도는 0 도 미만");
		
		else
			System.out.println("온도는 0 도 이상");
	}

}
