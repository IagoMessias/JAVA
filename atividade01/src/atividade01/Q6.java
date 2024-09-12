package atividade01;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Q6 {

	public static void main(String[] args) {
		
		
		List<String> pessoas = new ArrayList<>();
		List<Float> imcL = new ArrayList<>();
		List<Integer> idadeL = new ArrayList<>();
		List<Float> pesoL = new ArrayList<>();
		List<Float> alturaL = new ArrayList<>();
		
		Scanner entrada = new Scanner(System.in);
		String nome;
		int idade;
		float peso;
		float altura;
		String op;
		
		do {
			System.out.println("Escreva o nome da pessoa: ");
			nome = entrada.nextLine();
			pessoas.add(nome);
			
			System.out.println("Escreva a idade da pessoa: ");
			idade = entrada.nextInt();
			idadeL.add(idade);
			
			System.out.println("Escreva o peso da pessoa: ");
			peso = entrada.nextFloat();
			pesoL.add(peso);
			
			System.out.println("Escreva a altura da pessoa: ");
			altura = entrada.nextFloat();
			alturaL.add(altura);
			
			entrada.nextLine();
			
			float imc;
			imc = peso/altura*altura;
			imcL.add(imc);
			
			System.out.println("Deseja sair? S/N");
			op = entrada.nextLine();
			
			
			
			if (op.equals("S") || op.equals("s")) {
                break;
			}
		}
			while (!op.equals("S") && !op.equals("s"));
		

		int qtdPessoas = pessoas.size();
		System.out.println(pessoas+"Quantidade de pessoas: " +qtdPessoas+"\n"+imcL+"\n"+idadeL+"\n"+pesoL+"\n"+alturaL);
		
		String nomeChamado;
		System.out.println("Chame o nome da pessoa: ");
		nomeChamado = entrada.nextLine();
		
		int Pindex = pessoas.indexOf(nomeChamado);
		float IMCindex = imcL.get(Pindex);
		if (IMCindex<18.5) {
			System.out.println(nomeChamado +"Possui IMC: "+IMCindex +" "+"Então está Abaixo do peso");
			}
		else if (IMCindex>=18.5&&IMCindex<=24.9) {
			System.out.println(nomeChamado +"Possui IMC: "+IMCindex +" "+"Então está no peso Ideal");
			}
		else if (IMCindex>=25&&IMCindex<=29.9) {
			System.out.println(nomeChamado +"Possui IMC: "+IMCindex +" "+"Então está com Sobrepeso");
			}
		else if (IMCindex>=30&&IMCindex<=34.9) {
			System.out.println(nomeChamado +"Possui IMC: "+IMCindex +" "+"Então está com Obesidade grau II");
			}
		else if (IMCindex>=35&&IMCindex<=39.9) {
			System.out.println(nomeChamado +"Possui IMC: "+IMCindex +" "+"Então está com Obesidade grau II");
			}
		else if (IMCindex>40) {
			System.out.println(nomeChamado +"Possui IMC: "+IMCindex +" " + "Então está com Obesidade Mórbida");
			}
		entrada.close();
		
	}

}
