import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String nome;
		int idade;
		float salario;
		char sexo, civil;

		while (true) {
			System.out.println("Informe um nome: ");
			nome = input.nextLine();
			if (nome.length() > 3) {
				System.out.println("Nome v�lido.");
				break;
			} else {
				System.out.println("O nome precisa ter mais que 3 caracteres.");
			}
		}

		while (true) {
			System.out.println("Informe uma idade entre 0 a 150: ");
			idade = input.nextInt();
			if ((idade > 0) && (idade <= 150)) {
				System.out.println("Idade v�lida.");
				break;
			} else {
				System.out.println("Idade precisa ser entre 0 a 150");
			}
		}

		while (true) {
			System.out.println("Informe um sal�rio maior que 0: ");
			salario = input.nextFloat();
			if (salario > 0) {
				System.out.println("Salario v�lido.");
				break;
			} else {
			}
		}

		while (true) {
			System.out.println("Informe o sexo (f ou m): ");
			sexo = input.next().charAt(0);
			sexo = (Character.toString(sexo).toUpperCase()).charAt(0);
			if ((sexo == 'M') || (sexo == 'F')) {
				System.out.println("Sexo v�lido.");
				break;
			} else {
				System.out.println("O sexo precisa ser Feminino ou Masculino (f ou m)");
			}
		}

		while (true) {
			System.out.println("Informe um estado civil: soleiro (s), Casado(c), Vi�vo (v), Divorciado (d): ");
			civil = input.next().charAt(0);
			civil = (Character.toString(civil).toUpperCase()).charAt(0);
			if (civil == 'S'|| civil == 'C' || civil == 'V' || civil == 'D') {
				System.out.println("O estado civil v�lido.");
				break;
			} else {
				System.out.println("O estado civil inv�lido.");
			}
		}
			input.close();

	}

}