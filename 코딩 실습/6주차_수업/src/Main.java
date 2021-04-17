import java.util.Scanner;

public class Main {

	static void Menu() {
		System.out.println("*******************");
		System.out.println("** 0. menu       **");
		System.out.println("** 1. setup      **");
		System.out.println("** 2. view setup **");
		System.out.println("** 3. simulation **");
		System.out.println("** 4. exit       **");
		
	}
	
	static void Setup(Car Audi) {
		Scanner sc = new Scanner(System.in);
		System.out.println("high speed (140 ~210)  > (입력하세요) ");
		int high =sc.nextInt();
		Audi.sethigh(high);
		Audi.Navi.find();
		Audi.Navi.monitor();
		System.out.println("complete navigation ");
	}
	
	static void View(Car Audi) {
		
		System.out.println("아우디에 최대 속력은 "+Audi.gethigh());
		Audi.Navi.monitor();
	}
	
	static void Simulation(Car Audi) {
		int n = Audi.Navi.getShortest() ;
		Speedgun gun = new Speedgun();
		for(int i=1; i<n;i++) {
			Road road = new Road();
			gun.shot(Audi);
			System.out.print("도로명 "+i + "\t" );
			gun.limit(road);

			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Car Audi = new Car() ;

		int num = 0 ;
		while(num!=4) {
			num=sc.nextInt();
			switch(num){
				case 0: 
					Menu();
					break;
				case 1: 
					Setup(Audi);
					break;
				case 2: 
					View(Audi);
					break;
				case 3: 
					Simulation(Audi);
					break;
				
				case 4: 
					break;
				
			}

		}
		
	}
		
		
		
		
		
		
		
		
		
		
		/*
		System.out.println("스피드건 모의 실험 ");
		Car Audi = new Car();
		
		System.out.println("최고 속도: " + Audi.gethigh()+ "Km");
		// System.out.println("현재 속도: "+ Audi.current()+ "Km");
		
		int n = Audi.Navi.find(); // 나중에 도로 수만큼 for 문 돌리기 위해 n으로 받아둔다.
		
		Audi.Navi.monitor();
		
		//simulation 
		
		for(int i=1 ;i<=n;i++) {  //목적지까지 각각의 도로와 스피드건을 지나간다.  
			//도로 , 스피드건 생성 
			
			// 반복문이 될때 마다 도로를 생성한다.
			// 각 도로마다 스피드 건이 있기 때문에 생성
			Road road = new Road();
			System.out.print("도로명 "+i + "\t" + road.getLimit()+"Km  ");
			// 스피드건 -> 차의 속도를 얻어 오는 메세지 패싱 
			// 스피드건 -> monitor() : 메세지 패싱  -제한 속도를 얻어와서 비교해야한다.
			//넘었으면 넘었따 말하는 출력문 까지
			
			System.out.println("현재 속도: "+ Audi.current()+ "Km");

			
		}
		
		
		
		Navigator iNavi =new Navigator();
		iNavi.find();
		iNavi.monitor();
		*/
		
		
		
		
	}


