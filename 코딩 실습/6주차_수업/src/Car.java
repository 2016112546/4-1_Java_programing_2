class Car {
	private int high ; 
	Navigator Navi ; // ���� ���� Has a 
	
	
	//������ ����� �ְ� �ӵ��� �׺�����͸� ���� �ϰ� �ִ´�.
	Car(){
		Navi = new Navigator();	
	}

	void sethigh(int high) {
		this.high=high;	
	}
	
	int gethigh() {
		return high;
	}
	
	// ��û �Ҷ� ���� ����ӵ� ��ȯ���ֱ� 
	int current() {
		return (int)(Math.random()*high+1);
	}
	
	
	
}
