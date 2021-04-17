class Car {
	private int high ; 
	Navigator Navi ; // 구성 관계 Has a 
	
	
	//생성자 만들면 최고 속도와 네비게이터를 포함 하고 있는다.
	Car(){
		Navi = new Navigator();	
	}

	void sethigh(int high) {
		this.high=high;	
	}
	
	int gethigh() {
		return high;
	}
	
	// 요청 할때 마다 현재속도 반환해주기 
	int current() {
		return (int)(Math.random()*high+1);
	}
	
	
	
}
