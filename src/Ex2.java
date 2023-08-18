import java.util.Scanner;

public class Ex2 {

		public static void main(String[] args) {

			Scanner input = new Scanner(System.in);

			System.out.println("Informe um nome de usu�rio: ");
			String usuario = input.nextLine();
			System.out.println("Informe uma senha: ");
			String senha = input.nextLine();

			while (usuario.equals(senha)) {
				System.out.println("Login e senha s�o iguais! Digite novamente.");
				System.out.println("Informe um nome de usu�rio: ");
				usuario = input.nextLine();
				System.out.println("Informe uma senha: ");
				senha = input.nextLine();
			}
			input.close();
	}

}