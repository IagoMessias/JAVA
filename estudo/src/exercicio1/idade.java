package exercicio1;
import java.util.Scanner;

public class idade {
	public static void main(String[]args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escreva a idade: ");
		int idade = entrada.nextInt();
		
		entrada.close();
		System.out.println("A Idade é: "+idade);
		
		
		
	}

}
