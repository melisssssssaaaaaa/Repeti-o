import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o primeiro n�mero inteiro");
		int primeiro = input.nextInt();
		System.out.println("Insira o segundo n�mero inteiro");
		final int MAX = input.nextInt();
		
		
		for(int i = primeiro +1; i < MAX ; i++) { 
			System.out.print(i + "|");
		}
		
		input.close();
	}

}