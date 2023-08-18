import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		
		System.out.println("Insira Pre�o do p�o:");
		double pao= input.nextDouble();
		int i = 0;
		double quantia;
		
		System.out.println("Pre�o do p�o: " + pao);
		System.out.println("Panificadora P�o de Ontem - Tabela de pre�os");
	
		while(i>=0 && i<50) {
			++i;
			quantia=(i*pao);
			System.out.println(i + " - R$ " + quantia);
		}
		
		input.close();
	}

}