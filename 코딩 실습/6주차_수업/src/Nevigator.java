
class Navigator {
	 private int shortest;
	 //5������ 10�� �̳� ���� 
	 
	 int find() {
		 shortest =5+(int)(Math.random()*6);
		 return shortest ;
	 }
	 
	 
	 
	 public int getShortest() {
		return shortest;
	}





	void monitor() {
		 System.out.println("\n------------------�׺� ȭ�� -----------------");
		 System.out.println("���������� ���ΰ���: "+ shortest);
		 System.out.println("------------------------------------------")
		 ;
	 }
	

}
