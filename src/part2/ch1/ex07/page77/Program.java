class Program {
	public static void main(String[] args) {

		// 시험 과목들
		int kor, eng, math;

		// 시험성적을 저장할 변수들
		int total;
		float avg;

		// 시험성적 입력
		kor = 60;
		eng = 70;
		math = 80;

		// 시험성적 계산
		total = kor + eng + math;
		avg = total / 3.0f;
		
		// 시험성적 출력
		System.out.printf("총점:%d, 평균:%f", total, avg);
	}
}