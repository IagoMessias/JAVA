package atividade01;
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String aluno;
		System.out.println("Escreva o nome do aluno: ");
		aluno = entrada.nextLine();
		
		float nota1;
		float nota2;
		
		System.out.println("Escreva sua primeira nota: ");
		nota1 = entrada.nextFloat();
		
		System.out.println("Escreva a segunda nota: ");
		nota2 = entrada.nextFloat();
		
		float media;
		media = (nota1+nota2)/2;
		
		if (media<6) {
			System.out.println(aluno + " " + "está Reprovado com média: "+" "+media);
			}
		else if (media>=6) {
			System.out.println(aluno+ " " + "está Aprovado com média: "+media);
		}
		entrada.close();
		
		
	}
}