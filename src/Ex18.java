import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Insira um n�mero inteiro:");
		int primo = input.nextInt();

		if ((primo % 2 == 0) && (primo != 2))
			System.out.println("N�o � um n�mero primo!");
		else if (primo == 1)
			System.out.println("N�o � um n�mero primo!");
		else
			System.out.println("� um n�mero primo!");

		System.out.println("O n�mero inteiro ser� divis�vel por:");
		for (int i = 1; i <= primo; i++) {
			if (primo % i == 0)
				System.out.print(i + " | ");
		}
		input.close();

	}

}