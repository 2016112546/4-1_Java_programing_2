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
		System.out.println("high speed (140 ~210)  > (�Է��ϼ���) ");
		int high =sc.nextInt();
		Audi.sethigh(high);
		Audi.Navi.find();
		Audi.Navi.monitor();
		System.out.println("complete navigation ");
	}
	
	static void View(Car Audi) {
		
		System.out.println("�ƿ�� �ִ� �ӷ��� "+Audi.gethigh());
		Audi.Navi.monitor();
	}
	
	static void Simulation(Car Audi) {
		int n = Audi.Navi.getShortest() ;
		Speedgun gun = new Speedgun();
		for(int i=1; i<n;i++) {
			Road road = new Road();
			gun.shot(Audi);
			System.out.print("���θ� "+i + "\t" );
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
		System.out.println("���ǵ�� ���� ���� ");
		Car Audi = new Car();
		
		System.out.println("�ְ� �ӵ�: " + Audi.gethigh()+ "Km");
		// System.out.println("���� �ӵ�: "+ Audi.current()+ "Km");
		
		int n = Audi.Navi.find(); // ���߿� ���� ����ŭ for �� ������ ���� n���� �޾Ƶд�.
		
		Audi.Navi.monitor();
		
		//simulation 
		
		for(int i=1 ;i<=n;i++) {  //���������� ������ ���ο� ���ǵ���� ��������.  
			//���� , ���ǵ�� ���� 
			
			// �ݺ����� �ɶ� ���� ���θ� �����Ѵ�.
			// �� ���θ��� ���ǵ� ���� �ֱ� ������ ����
			Road road = new Road();
			System.out.print("���θ� "+i + "\t" + road.getLimit()+"Km  ");
			// ���ǵ�� -> ���� �ӵ��� ��� ���� �޼��� �н� 
			// ���ǵ�� -> monitor() : �޼��� �н�  -���� �ӵ��� ���ͼ� ���ؾ��Ѵ�.
			//�Ѿ����� �Ѿ��� ���ϴ� ��¹� ����
			
			System.out.println("���� �ӵ�: "+ Audi.current()+ "Km");

			
		}
		
		
		
		Navigator iNavi =new Navigator();
		iNavi.find();
		iNavi.monitor();
		*/
		
		
		
		
	}


