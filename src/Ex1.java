import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		float nota;

		do {
			System.out.println("Informe uma nota(de 0 - 10): ");
			nota = input.nextFloat();
			if (nota > 10 || nota < 0) {
				System.out.println("Valor Inv�lido!");
			}
		} while (nota > 10 || nota < 0);
		System.out.println("Valor V�lido!");
		input.close();
	}

}