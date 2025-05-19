package exercicio1;
import java.util.Scanner;

public class AlunosMelhorado {
	public static void main(String[]args) {
		Scanner entrada=new Scanner(System.in);
		String[] alunos = new String[3];
		int[] notas = new int[alunos.length];
		
		for(int i = 0; i<alunos.length;i++) {
			System.out.println("Escreva o nome do aluno "+(i+1));
			String nome = entrada.nextLine();
			alunos[i]=nome;
			
		}
		
		for (int i =0; i<alunos.length; i++) {
			System.out.println("Escreva a nota do aluno: "+(i+1));
			int notasR = entrada.nextInt();
			notas[i]=notasR;
			//testes
			
		}
		String aprovação = "Aprovado";		
		
		entrada.close();
		for (int i = 0; i<alunos.length;i++) {
			if (notas[i]<6) {
				aprovação="Reprovado";
			}else {
				aprovação="Aprovado";
			}
			
			System.out.println("Aluno"+" "+(i+1)+" "+alunos[i]+" "+notas[i]+" "+aprovação+"\n");
	
		}
		
}
	
}

