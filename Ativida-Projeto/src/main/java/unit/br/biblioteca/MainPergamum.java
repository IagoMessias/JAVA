package unit.br.biblioteca;
import java.util.ArrayList;

public class MainPergamum {
    public static void main(String[] args) {
        Pergamum pergamum = new Pergamum(1, "Biblioteca municipal", 10, 10);

        LivroPergamum livro1 = new LivroPergamum(1, "Percy Jackson", "Rick Riordan", "555", 10, 2);
        LivroPergamum livro2 = new LivroPergamum(2, "Programacao", "Programador", "333", 10, 3);
        LivroPergamum livro3 = new LivroPergamum(3, "Harry Potter", "Desconhecido", "2222", 10, 2);

        pergamum.cadastrarLivro(livro1);
        pergamum.cadastrarLivro(livro2);
        pergamum.cadastrarLivro(livro3);

        AlunoPergamum aluno1 = new AlunoPergamum(1, "Pedro", 1);
        AlunoPergamum aluno2 = new AlunoPergamum(2, "Marcos", 3);
        AlunoPergamum aluno3 = new AlunoPergamum(3, "Joao", 6);

        pergamum.cadastrarAluno(aluno1);
        pergamum.cadastrarAluno(aluno2);
        pergamum.cadastrarAluno(aluno3);

        aluno1.emprestarLivro(livro2);

        LivroPergamum livroBuscado = pergamum.buscarLivro(1);
        if (livroBuscado != null) {
            System.out.println("Livro encontrado: " + livroBuscado.getTitulo());
        }
        else {
            System.out.println("Livro não encontrado.");
        }

        LivroPergamum livroRetirado = pergamum.retirarLivro(1);
        if (livroBuscado != null) {
            System.out.println("Livro Retirado: " + livroRetirado.getTitulo());
        }
        else {
            System.out.println("Livro não encontrado.");
        }

        System.out.println(livro2.imprimirDadosLivro());

        aluno1.devolverLivro(livro2);
    }
}
