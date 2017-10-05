import java.io.IOException;
import java.util.Scanner;

class Program {
	public static void main(String[] args) throws IOException {

		int[] kors = new int[3];
		kors[0] = 0;
		kors[1] = 0;
		kors[2] = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print(" 국어:");
		kors[0] = scan.nextInt();
		System.out.print(" 국어:");
		kors[1] = scan.nextInt();
		System.out.print(" 국어:");
		kors[2] = scan.nextInt();
		
	}
}