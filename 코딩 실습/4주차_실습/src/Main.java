import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); 
		
		System.out.println("´Ü¾îÀå °¹¼ö  > " );
		int n= sc.nextInt(); 
		String word[][] = new String[n][2] ;
		
		for(int i=0 ; i<n;i++) {
			for(int j=0 ;j<2;j++) {
				word[i][j]=sc.next();
			}
		}
		int cnt =2 ;
		while(true) {
			int a = (int)(Math.random()*n);
			System.out.println(word[a][0] + ">");
			String b = sc.next();
			if(b.equals(word[a][1])) {
				System.out.println("YES");
				cnt ++ ;
				System.out.println(cnt);
				if(cnt==5) {
					System.out.println("Pass");
					break;
				}
			}
			else {
				System.out.println("NO");
				cnt--;
				if(cnt<0) {
					System.out.println("Fail");
					break;
				}
			}
		}
		sc.close();
		
	}

}
