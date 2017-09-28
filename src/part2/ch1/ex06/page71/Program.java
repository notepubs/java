package part2.ch1.ex06.page71;

class Program{	
	public static void main(String[] args) {
		int kor;
		int eng;
		int math;
		int total;		
		float avg;
		
		kor = 60;
		eng = 70;
		math = 80;
		
		total = kor + eng + math;
		avg = total / 3.0f;
		
		System.out.printf("ÃÑÁ¡:%d, Æò±Õ:%f", total, avg);
	}
}