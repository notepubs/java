class Program {
	public static void main(String[] args) {

		// 시험 과목들
		int kor, eng, math;
		
		// 시험성적을 저장할 변수들
		int total; // 초깃값은 일부러 지정 안 함
		float avg;
		
		// 시험성적 입력
		kor = 60;
		eng = 70;
		math = 80;
		
		// 시험성적 계산
		total = kor + eng + math;
		avg = /* 정숫값 */ total / 3;
		
		// 시험성적 출력 부분		
		System.out.println("┌────────────────────┐");
		System.out.println("│        성적 출력          │");
		System.out.println("└────────────────────┘");
		System.out.println(" 국어:0");
		System.out.println(" 영어:0");
		System.out.println(" 수학:0");
		System.out.println(" 총점:0");
		System.out.println(" 평균:0");
		System.out.println("──────────────────────");
		
	}
}