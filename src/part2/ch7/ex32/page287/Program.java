
import java.io.IOException;
import java.util.Scanner;

class Program {
	public static void main(String[] args) throws IOException {

		// 시험 과목들
		int kor = 0, eng = 0, math = 0;
		int kors[] = new int[3];
		int engs[] = new int[3];
		int maths[] = new int[3];
		
		int index = 0;
		

		Scanner scan = new Scanner(System.in);
		
		EXIT: while (true) {
			
			int menu;
			
			System.out.println("┌────────────────────┐");
			System.out.println("│        메인 메뉴          │");
			System.out.println("└────────────────────┘");
			System.out.print(" 1. 성적 입력\n");
			System.out.print(" 2. 성적 출력\n");
			System.out.print(" 3. 프로그램 종료\n");
			System.out.print(" 선택 > ");
			menu = scan.nextInt();
			
			switch (menu) {
			case 1:
			{
				int more = 0;
				
				do {
					System.out.println("┌────────────────────┐");
					System.out.println("│        성적 입력          │");
					System.out.println("└────────────────────┘");
					
					do {
						System.out.print(" 국어:");
						kor = scan.nextInt();

						if (kor < 0 || kor > 100)
							System.out.println("성적의 범위(0~100)를 벗어났습니다. 재입력하세요");
					} while (kor < 0 || kor > 100);
					
					do {
						System.out.print(" 영어:");
						eng = scan.nextInt();
						if (eng < 0 || eng > 100)
							System.out.println("성적의 범위(0~100)를 벗어났습니다. 재입력하세요");
					} while (eng < 0 || eng > 100);
					
					do {
						System.out.print(" 수학:");
						math = scan.nextInt();
						if (math < 0 || math > 100)
							System.out.println("성적의 범위(0~100)를 벗어났습니다. 재입력하세요");
					} while (math < 0 || math > 100);
					
					kors[index] = kor;
					engs[index] = eng;
					maths[index] = math;
					index++;
					
					System.out.println("──────────────────────");
					System.out.print("더 입력하시겠습니까?(1 or 0) : ");
					more = scan.nextInt();
					
				} while (more == 1);
			}
				break;
			case 2:
			{
				int total;
				float avg;
								
				System.out.println("┌────────────────────┐");
				System.out.println("│        성적 출력          │");
				System.out.println("└────────────────────┘");
				
				for (int i = 0; i < index; i++) {
					// i 번째 값을 임시 변수에 담기
					kor = kors[i];
					eng = engs[i];
					math = maths[i];
					
					// 시험성적 계산
					total = kor + eng + math;
					avg = total / 3.0f;
					
					System.out.printf(" 시험 %d\n----------------------\n", i + 1);
					System.out.printf(" 국어:%d\n", kor);
					System.out.printf(" 영어:%d\n", eng);
					System.out.printf(" 수학:%d\n", math);
					System.out.printf(" 총점:%d\n", total);
					System.out.printf(" 평균:%.2f\n", avg);
					System.out.println("──────────────────────");
				}
			}
				break;
			case 3:
				break EXIT;
			default:
				System.out.println("입력이 잘못되었습니다. 입력할 수 있는 범위는 1~3입니다. 다시 입력해주세요");
			}
		}

	}
}