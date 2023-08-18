import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double total = 0;
		double media = 0;

		System.out.println("Qual � a quantidade de CD's que a cole��o possu�?");
		int cd = input.nextInt();

		for (int i = 1; i <= cd; i++) {
			System.out.println("Qual � a quantidade m�dia gasta por esse CD?");
			double gasto = input.nextDouble();

			total = total + gasto;
		}
		media = (double) (total / cd);
		System.out.println("Qual � a quantidade m�dia gasta por CD?");
		System.out.println("O valor total investido foi:" + total);
		System.out.println("O valor m�dio investido por CD foi:" + media);

		input.close();
	}

}