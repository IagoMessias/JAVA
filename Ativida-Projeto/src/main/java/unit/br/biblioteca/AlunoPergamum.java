package unit.br.biblioteca;

import java.util.ArrayList;

public class AlunoPergamum {

    private int matricula;
    private String nomeAluno;
    private ArrayList<LivroPergamum> emprestimos;

    public AlunoPergamum(){}

    public  AlunoPergamum(int matricula, String nomeAluno, int totalLivros){
        this.matricula = matricula;
        this.nomeAluno = nomeAluno;
        this.emprestimos = new ArrayList<LivroPergamum>(totalLivros);
    }


    public ArrayList<LivroPergamum> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(ArrayList<LivroPergamum> emprestimos) {
        this.emprestimos = emprestimos;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }


    public boolean emprestarLivro (LivroPergamum livro) {
        if (!emprestimos.contains(livro) && livro.isDisponivel()) {
            emprestimos.add(livro);
            livro.setExemplaresEmprestados(livro.getExemplaresEmprestados() + 1);
            return true;
        }
        return false;
    }

    boolean devolverLivro (LivroPergamum livro){
        if (emprestimos.contains(livro)) {
            emprestimos.remove(livro);
            livro.setExemplaresEmprestados(livro.getExemplaresEmprestados() - 1);
            return true;
        }
        return false;
    }


}
