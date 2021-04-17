
class Navigator {
	 private int shortest;
	 //5개에서 10개 이내 도로 
	 
	 int find() {
		 shortest =5+(int)(Math.random()*6);
		 return shortest ;
	 }
	 
	 
	 
	 public int getShortest() {
		return shortest;
	}





	void monitor() {
		 System.out.println("\n------------------네비 화면 -----------------");
		 System.out.println("목적지까지 도로개수: "+ shortest);
		 System.out.println("------------------------------------------")
		 ;
	 }
	

}
