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
		if((flag&0b00001000)==0)   //3��° �ε����� 1�� �ƴϸ� 0�� �̸�
			System.out.println("�µ��� 0 �� �̸�");
		
		else
			System.out.println("�µ��� 0 �� �̻�");
	}

}
