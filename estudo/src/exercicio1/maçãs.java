package exercicio1;
import java.util.Scanner;

public class maçãs {
	public static void main(String[]args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escreva a quantidade de maçãs: ");
		int qtd = entrada.nextInt();
		entrada.close();
		
		if (qtd<12) {
			System.out.println("O valor total é "+qtd*0.30);
		}else {
			System.out.println("O valot total é "+qtd*0.25);
		}
		
		
	}
	

}
