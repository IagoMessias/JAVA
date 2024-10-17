package apsii;
import java.util.Scanner;

public class Salarios extends Funcionario {
	
	

	public static void ClassificaçaoFuncionario() {
		Scanner seleçao = new Scanner(System.in);
		System.out.println("Selecione a classificação:"+"\n"+""
				+ "1 - Assalariado"+"\n"+
				"2 - Comissionado"+"\n"+
				"3 - Honorista");
		int num=seleçao.nextInt();
		
		if(num==1) {
			Assalariado();
		} else if(num==2) {
			Comissionado();
		}
		else if(num==3) {
			Honorista();
		}
		seleçao.close();
	}
	
	public static void Assalariado() {
		Scanner Cargo = new Scanner(System.in);
		System.out.println("Selecione o cargo:"+"\n"+"1 - Assistente"+"\n"+
		"2 - Supervisor");
		int cargo = Cargo.nextInt();
		if(cargo==1) {
			
			System.out.println("O Assistente ganha: "+1400);
			
		}else if (cargo==2){
			System.out.println("O Supervisor ganha "+1400*2);
		}
		Cargo.close();

		
		
	}
	
	public static void Comissionado() {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual valor das vendas referentes a vestuario o funcionário fez? ");
		float vVest = entrada.nextFloat();
		
		System.out.println("Qual o valor das vendas referentes a calçados o funcionário fez? ");
		float vCalç = entrada.nextFloat();
		entrada.close();
		
		float SalarioComissao = vVest*0.05f + vCalç*0.07f; 
		System.out.println("O Salario do funcionário será: "+SalarioComissao);
		
	}
	
	public static void Honorista() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escreva as horas trabalhadas pelo funcionário: ");
		float horas = entrada.nextFloat();
		entrada.close();
		
		float SalarioHonorista = 55*horas;
		System.out.print("O Salario do funcionario será: "+SalarioHonorista);
		
		
	}

}
