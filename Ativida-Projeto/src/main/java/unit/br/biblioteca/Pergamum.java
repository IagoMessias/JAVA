package unit.br.biblioteca;

import java.util.ArrayList;

public class Pergamum extends AlunoPergamum{
    private int codigo;
    private String nome;
    private ArrayList<LivroPergamum> listaLivros;
    private ArrayList<AlunoPergamum> listaAlunos;



    public void setListaAlunos(ArrayList<AlunoPergamum> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

    public void setListaLivros(ArrayList<LivroPergamum> listaLivros) {
        this.listaLivros = listaLivros;
    }

    public Pergamum() {}

    public Pergamum (int codigo, String nome, int totalLivros, int totalAlunos) {
        this.codigo = codigo;
        this.nome = nome;
        this.listaLivros = new ArrayList<>(totalLivros);
        this.listaAlunos = new ArrayList<>(totalAlunos);
    }



    public int getCodigo() {
        return codigo;
    }


    public ArrayList<AlunoPergamum> getListaAlunos() {
        return listaAlunos;
    }



    public ArrayList<LivroPergamum> getListaLivros() {
        return listaLivros;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    boolean cadastrarAluno(AlunoPergamum aluno){
        for(AlunoPergamum a : listaAlunos){
            if (a.getMatricula() == aluno.getMatricula()) {
                return false;
            }
        }
        listaAlunos.add(aluno);
        return  true;
    }

    public String retirarAluno (int matricula){
        for(AlunoPergamum aluno: listaAlunos) {
            if (aluno.getMatricula() == matricula){
                listaAlunos.remove(aluno);
                return  aluno.getNomeAluno();
            }
        }
        return  null;
    }

    public boolean cadastrarLivro (LivroPergamum livro){
        listaLivros.add(livro);
        return true;
    }

    public LivroPergamum retirarLivro (int codigo){
        for(LivroPergamum livro: listaLivros) {
            if (livro.getCodigo() == codigo) {
                listaLivros.remove(livro);
                return livro;
            }
        }
        return null;
    }
    public  LivroPergamum buscarLivro (int codigo) {
        for(LivroPergamum livro : listaLivros) {
            if (livro.getCodigo() == codigo) {
                return livro;
            }
        }
        return null;
    }
}
