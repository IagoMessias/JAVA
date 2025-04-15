package testes;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
//Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas. Fazer um algoritmo que calcule e escreva:
//a. a maior e a menor altura do grupo;
//b. média de altura dos homens;
//c. o número de mulheres.

//melhorar código

public class Alturas {

	public static void main(String[] args) {
		int sexo=0;
		float altura=0;
		
		Scanner entrada = new Scanner(System.in);
		
		//listas
		ArrayList<String> mulher = new ArrayList();
		ArrayList<String> homem = new ArrayList();
		ArrayList<Float> altura_homens = new ArrayList();
		ArrayList<Float> altura_mulheres = new ArrayList();
		ArrayList<Float> altura_geral = new ArrayList();

		//for para adicionar 10 pessoas
		for (int i=0; i<10;i++ ) {
			
			System.out.println("Selecione o Sexo: Mulher = 1 ou Homem = 2");
			sexo=entrada.nextInt();
			if (sexo==1) {
				mulher.add("1");
				System.out.println("Qual a altura da mulher?");
				altura=entrada.nextFloat();
				altura_mulheres.add(altura);
				altura_geral.add(altura);

				
			}else if (sexo==2) {
				homem.add("2");
				System.out.println("Qual a altura do homem?");
				altura=entrada.nextFloat();
				altura_homens.add(altura);
				altura_geral.add(altura);

				
			}else {
				System.out.println("Comando Incorreto");
			}
			float altura_max = Collections.max(altura_geral);
	        float altura_min = Collections.min(altura_geral);
	        
	        float somaAlturaH=0;
	        for (float h : altura_homens) {
	        	somaAlturaH+=h;
	        }
	        float mediaAlturaHomens = somaAlturaH / altura_homens.size();
			
			//a
			System.out.println("=========="+"\n"+"Altura Maior: "+altura_max+"\n"+"Altura Menor: "+altura_min);
			//b
			System.out.println("Altura Média dos homens: "+mediaAlturaHomens);
			//c
			System.out.println("Quantidade de mulheres: "+mulher.size()+"\n"+"==========");
		}
		
		
		
	}

}
