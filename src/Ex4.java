import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double paisa = 80000;
		double paisb = 200000;
		int anos = 0;
		double cresca = 0.03;
		double crescb = 0.015;
		while (paisa < paisb) {
			anos = (anos + 1);
			paisa = paisa + (paisa * cresca);
			paisb = paisb + (paisb * crescb);
		}
		System.out.println("Ap�s" + " " + anos + " " + "anos, pa�s A ultrapassou o pa�s B em n�mero de habitantes");

		input.close();
	}

}