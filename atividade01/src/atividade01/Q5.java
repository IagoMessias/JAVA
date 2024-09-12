package atividade01;
import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float num1;
		float num2;
		
		System.out.println("Escreva o primeiro número: ");
		num1 = entrada.nextFloat();
		
		System.out.println("Escreva o segundo número: ");
		num2 = entrada.nextFloat();
		
		float adicao;
		adicao = num1+num2;
		float subtracao;
		subtracao = num1-num2;
		float multiplicacao;
		multiplicacao = num1*num2;
		float divisao;
		divisao = num1/num2;
		
		int op=0;
		System.out.println("Escolha a Operação: ");
		System.out.println("1 - Adição");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		op = entrada.nextInt();
		
		if (op == 1) {
			System.out.println("Resultado:"+"é"+" "+adicao);
			}
		else if (op == 2) {
			System.out.println("Resultado:"+"é"+" "+subtracao);
		}
		else if (op == 3) {
			System.out.println("Resultado:"+"é"+" "+multiplicacao);
		}
		else if (op == 4) {
			System.out.println("Resultado:"+"é"+" "+divisao);
		}
		entrada.close();


	}

}
