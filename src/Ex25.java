import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Loja Quase Dois - Tabela de Pre�os");
		int i = 0;
		double produto;

		while (i >= 0 && i < 50) {
			++i;
			produto = (i * 1.99);
			System.out.println(i + " - R$ " + produto);
			input.close();

	}
	}
}