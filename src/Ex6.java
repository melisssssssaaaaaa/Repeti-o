import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final int MAX = 50;
		
		
		for(int i = 1; i <= MAX; i++) { 
			if (i%2 != 0)
			System.out.println(i);
		}
		
		input.close();
}
	}
