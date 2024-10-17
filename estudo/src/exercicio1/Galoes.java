package exercicio1;
import java.util.Scanner;
public class Galoes {
	
	public static void main(String[]args) {
		Scanner entrada = new Scanner(System.in);
		
		float galao=3.7854f; 
		System.out.println("Escreva a quantidade: ");
		int qtd=entrada.nextInt();
		entrada.close();
		
		System.out.println("Total de litros é: "+galao*qtd);
		
		
		
	}
	

}
