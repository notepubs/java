
import java.io.IOException;
import java.util.Scanner;

class Program {
	public static void main(String[] args) throws IOException {

		// 오목판 배열 생성
		char[][] board = new char[5][7];
		for (int y = 0; y < 5; y++)
			for (int x = 0; x < 7; x++)
				board[y][x] = '┼';
		
		// -- 오목판 경계선 꾸미기-----------------------
		// 네 개의 꼭짓점
		board[0][0] = '┌';
		board[0][6] = '┐';
		board[4][0] = '└';
		board[4][6] = '┘';

		// 상단 경계선
		for (int n = 1; n <= 5; n++)
			board[0][n] = '┬';
		// 좌측 경계선
		for (int n = 1; n <= 3; n++)
			board[n][0] = '├';
		// 우측 경계선
		for (int n = 1; n <= 3; n++)
			board[n][6] = '┤';
		// 하단 경계선
		for (int n = 1; n <= 5; n++)
			board[4][n] = '┴';
		
		// -- 오목판 출력 -----------------------------
		for (int y = 0; y < 5; y++) {
			for (int x = 0; x < 7; x++)
				System.out.printf("%c", board[y][x]);
			System.out.println();
		}
		
		Scanner scan = new Scanner(System.in);
		
		// 사용자에게 오목 좌표 하나를 입력받는다.
		int omokX, omokY; // 오목
		System.out.print("오목 좌표 입력( x sp y ) : ");
		omokX = scan.nextInt();
		omokY = scan.nextInt();
		
		board[omokY][omokX] = '○';
		
		// -- 오목판 출력 -----------------------------
		for (int y = 0; y < 5; y++) {
			for (int x = 0; x < 7; x++)
				System.out.printf("%c", board[y][x]);
			System.out.println();
		}
	}
}