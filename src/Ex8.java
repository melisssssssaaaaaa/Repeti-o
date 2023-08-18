import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o primeiro n�mero inteiro");
		int primeiro = input.nextInt();
		System.out.println("Insira o segundon�mero inteiro");
		final int MAX = input.nextInt();
		
		int soma =0;
		
		for(int i = primeiro; i <= MAX; i++) { 
			soma = soma + i;
			System.out.print(soma + "|");
		}
		
		input.close();
	}

}