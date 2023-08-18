import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		float soma = 0;
		float media = 0;
		
		
		System.out.println("Qual ser� a quantidade de turmas?");
		int turmas = input.nextInt();
		
		for(int i = 1; i <= turmas; i++) {
		System.out.println("Insira a quantidade de alunos?");
		int alunos = input.nextInt();
			while (alunos>40) {
				System.out.println("O n�mero m�ximo de alunos aceito por turma s�o 40!");
				System.out.println("Insira a quantidade de alunos?");
				alunos = input.nextInt();
			}
			soma = soma + alunos;
			}
		media = soma/turmas;
		
		System.out.println("O n�mero m�dio de alunos por turma ser�:" + media);
		
		input.close();
	}

}