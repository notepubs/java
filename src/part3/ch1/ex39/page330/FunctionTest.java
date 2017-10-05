
class FunctionTest {
	
	public static void printLogo(){
		System.out.println("<<<<<<[µ¡¼À ÇÁ·Î±×·¥ ·Î°í]>>>>>>");
	}
	
	public static void main(String[] args) {
		
		int x = 3, y = 3;
		int result = 0;
		
		printLogo();
		
		y++;
		result = x + y;
		
		System.out.printf("add(%d, %d) : %d\n", x, y, result);
	}
}