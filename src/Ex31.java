import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		
		int alto = 0;
		int baixo = 0;
		int numalto = 0;
		int numbaixo = 0;
		
		for(int i = 0; i < 10; i++) {
			
			System.out.println("Insira o n�mero do aluno: ");
			int num = input.nextInt();
			System.out.println("Insira a altura do aluno: ");
			int alt = input.nextInt();
			
			if( i == 0) {
				alto = alt;
				numalto = num;
				baixo = alt;
				numbaixo = num;
			}	
			else {
				if(alt < baixo) {
					baixo = alt;
					numbaixo = num;
				}else if(alt > alto) {
					alto = alt;
					numalto = num;
				}
			}
		}
		
		System.out.println("N�mero do aluno mais alto: " + numalto);
		System.out.println("O aluno mais altos possui�: " + alto + " cent��metros.");
		System.out.println("N�mero do aluno mais baixo: " + numbaixo);
		System.out.println("O aluno mais altos possui�: " + baixo + " cent��metros.");
		input.close();	
}
}