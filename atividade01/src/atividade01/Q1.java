package atividade01;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
		
		int galoes;
		System.out.println("Digite a quantidade de galões: ");
		galoes = entrada.nextInt();
		
		System.out.println("A quantidade total de litros é: "+ " "+ (galoes*3.7854));
		
		entrada.close();
		
	}
}
