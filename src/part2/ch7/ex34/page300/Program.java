import java.io.IOException;
import java.util.Scanner;

class Program {
	public static void main(String[] args) throws IOException {

		// 오목판 배열 생성
		char[] board = new char[5 * 7];
		
		// -- 오목판 초기화하기-------------------------
		// 오목판 '┼' 문자로 초기화
		for (int i = 0; i < 5 * 7; i++)
			board[i] = '┼';
		
		// -- 오목판 경계선 꾸미기-----------------------
		// 네 개의 꼭지점
		board[0 * 7 + 0] = '┌';
		board[0 * 7 + 6] = '┐';
		board[4 * 7 + 0] = '└';
		board[4 * 7 + 6] = '┘';
		
		// 상단 경계선
		for (int i = 0; i < 5; i++)
			board[0 * 7 + (i + 1)] = '┬';
		// 좌측 경계선
		for (int i = 0; i < 3; i++)
			board[(i + 1) * 7 + 0] = '├';
		// 우측 경계선
		for (int i = 0; i < 3; i++)
			board[(i + 1) * 7 + 6] = '┤';
		// 하단 경계선
		for (int i = 0; i < 5; i++)
			board[4 * 7 + (i + 1)] = '┴';
		
		// -- 오목판 출력 -----------------------------
		for (int y = 0; y < 5; y++) {
			for (int x = 0; x < 7; x++)
				System.out.printf("%c", board[y * 7 + x]);
			System.out.println();
		}
	}
}