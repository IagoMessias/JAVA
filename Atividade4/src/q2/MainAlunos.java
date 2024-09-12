package q2;
import java.util.Scanner;


public class MainAlunos{
	public static void main (String[] args) {
		Aluno[] alunos = new Aluno[3];
		NotaFinal[] notas = new NotaFinal[alunos.length];

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < alunos.length; i++) {
           System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            String nome = entrada.nextLine(); 

            alunos[i] = new Aluno();
            alunos[i].setNome(nome); 
        }
        
        for (int i = 0; i < alunos.length; i++) {
            System.out.print("Digite a nota1 do aluno " + (i + 1) + ": ");
            float nota1 = entrada.nextFloat();
            System.out.print("Digite a nota2 do aluno " + (i + 1) + ": ");
            float nota2 = entrada.nextFloat();
            System.out.print("Digite a nota3 do aluno " + (i + 1) + ": ");
            float nota3 = entrada.nextFloat();
            
            float media = (nota1+nota2+nota3) / 3;

            notas[i] = new NotaFinal();
            notas[i].setNotaFinal(media); 
            
        }
            

        

        System.out.println("\nAlunos cadastrados:");
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Aluno " + (i + 1) + ": " + alunos[i].getNome());
        }

        System.out.println("\nNotas finais dos alunos:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota final do Aluno " + (i + 1) + ": " + notas[i].getNotaFinal());
        }
        

        entrada.close();
    
}
}
