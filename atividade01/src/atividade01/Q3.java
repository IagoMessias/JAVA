package atividade01;
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		Scanner porta = new Scanner(System.in);
		
		int qtdmaça;
		System.out.println("Quantas maçãs serão compradas? ");
		qtdmaça = porta.nextInt();
		
		if (qtdmaça<12) {
			System.out.println("O total será: "+ " "+ "R$" + (qtdmaça*0.30));
		}
		
		else if (qtdmaça>=12) {
			System.out.println("O total será " + " "+ "R$"+(qtdmaça*0.25));
		}
		porta.close();
	}

}
