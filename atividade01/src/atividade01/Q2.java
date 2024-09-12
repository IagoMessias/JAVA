package atividade01;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escreva sua Idade: ");
		int idade;
		idade = entrada.nextInt();
		
		System.out.println("A idade do usuário é: " + " " + idade);
		entrada.close();
	}

}
