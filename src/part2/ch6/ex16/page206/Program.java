import java.io.IOException;
import java.util.Scanner;

class Program {
	public static void main(String[] args) throws IOException {

		// 시험 과목들
		int kor=0, eng=0, math=0;
		
		// 시험성적을 저장할 변수들
		int total; // 초깃값은 일부러 지정 안 함
		float avg;
		
		Scanner scan = new Scanner(System.in);
		
		int menu;
		
		while(true) {
		
			//메인 메뉴 코드가 들어갈 부분
			System.out.println("┌────────────────────┐");
			System.out.println("│        메인 메뉴          │");
			System.out.println("└────────────────────┘");
			System.out.print(" 1. 성적 입력\n");
			System.out.print(" 2. 성적 출력\n");
			System.out.print(" 3. 종료\n");
			System.out.print(" 선택 > ");
			menu = scan.nextInt();
			
			if(menu == 1) {
				System.out.println("┌────────────────────┐");
				System.out.println("│        성적 입력          │");
				System.out.println("└────────────────────┘");
				System.out.print(" 국어:");
				kor = scan.nextInt();
				System.out.print(" 영어:");
				eng = scan.nextInt();
				System.out.print(" 수학:");
				math = scan.nextInt();
				System.out.println("──────────────────────");
			}
			
			if(menu == 2) {
								
				// 시험성적 계산
				total = kor + eng + math;
				avg = /* 정숫값 */ total / 3;
				
				// 시험성적 출력 부분		
				System.out.println("┌────────────────────┐");
				System.out.println("│        성적 출력          │");
				System.out.println("└────────────────────┘");
				System.out.printf(" 국어:%d\n", kor);
				System.out.printf(" 영어:%d\n", eng);
				System.out.printf(" 수학:%d\n", math);
				System.out.printf(" 총점:%d\n", total);
				System.out.printf(" 평균:%.2f\n", avg);
				System.out.println("──────────────────────");
			}
			
			if(menu == 3) {
				break;
			}
		}
		
	}
}