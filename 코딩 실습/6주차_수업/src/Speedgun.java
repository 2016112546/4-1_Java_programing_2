
class Speedgun {

	private int theSpeed;
	private int limit;
	
	void shot(Car car) { // ���ǵ�� - > �� �ӵ��� ��� ���� �޼��� �н� 
		theSpeed = car.current();
	}
	
	void limit(Road road) {
		int limit=road.getLimit();
		qlry(limit);
	}
	
	void qlry(int limit) {
		System.out.print("\t"+"���� �ӵ��� " + theSpeed);
		System.out.print("\t"+"���� ������ "+ limit+ "\t");
		if(theSpeed>limit) {
			System.out.print(theSpeed-limit + " �ӵ� ���� ");
		}
	}
	
}
