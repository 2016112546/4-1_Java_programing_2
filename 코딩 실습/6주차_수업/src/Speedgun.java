
class Speedgun {

	private int theSpeed;
	private int limit;
	
	void shot(Car car) { // 스피드건 - > 차 속도를 얻어 오는 메세지 패싱 
		theSpeed = car.current();
	}
	
	void limit(Road road) {
		int limit=road.getLimit();
		qlry(limit);
	}
	
	void qlry(int limit) {
		System.out.print("\t"+"현재 속도는 " + theSpeed);
		System.out.print("\t"+"도로 제한은 "+ limit+ "\t");
		if(theSpeed>limit) {
			System.out.print(theSpeed-limit + " 속도 위반 ");
		}
	}
	
}
