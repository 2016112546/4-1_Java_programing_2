import java.util.Scanner;




public class Main {

	// 5. �޼ҵ� �����ϱ� 
	public static int[] change (int[][] arr) {
		int col, row ; 
		col = arr.length;
		row = arr[0].length;
		int[] temp = new int[col*row];
		for(int i=0 ;i<arr.length;i++) {
			for(int j=0 ;j<arr[i].length;j++) {
				//arr2[cnt++]=arr[i][j];
				temp[i*row+j]=arr[i][j];
			}
		}
		
		return temp;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. ���μ��� ũ�� �Է�
		System.out.println("2���� ���� ���� ũ�� �Է� > ");
		int row , col ; 
		Scanner sc = new Scanner(System.in);
		row = sc.nextInt();
		col = sc.nextInt();
		sc.close() ; 
		//2. ������ ���� ���� 10~99 	
		
		int arr[][] = new int[col][row] ;
		for(int i=0 ;i<arr.length;i++) {
			for(int j=0 ;j<arr[i].length;j++) {
				arr[i][j]=(int)(10+Math.random()*90);
			}
		}
		
		//2-2 �߳��Դ��� Ȯ���ϱ� 
		for(int i=0 ;i<arr.length;i++) {
			for(int j=0 ;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		//3. 2���� - > 1���� 
		
		int arr2[]=new int[col*row];
		int cnt=0;
		
		// �޼ҵ� �����غ��� 
		int arr3[];
		arr3=change(arr);
		
		
		for(int i=0 ;i<arr.length;i++) {
			for(int j=0 ;j<arr[i].length;j++) {
				//arr2[cnt++]=arr[i][j];
				arr2[i*row+j]=arr[i][j];
			}
		}
		System.out.println();
		//4. �� ������ Ȯ���ϱ� 
		for(int i=0 ; i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
			if(((i+1)%row)==0) {
				System.out.println();
			}
		}
		
		System.out.println();
		for(int i=0 ; i<arr3.length;i++) {
			System.out.print(arr3[i]+" ");
			if(((i+1)%row)==0) {
				System.out.println();
			}
		}

	}
}