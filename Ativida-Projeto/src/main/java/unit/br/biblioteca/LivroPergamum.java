package unit.br.biblioteca;

public class LivroPergamum {
    private int codigo;
    private String titulo;
    private String autor;
    private String isbn;
    private int totalExemplares;
    private int exemplaresEmprestados;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getExemplaresEmprestados() {
        return exemplaresEmprestados;
    }

    public void setExemplaresEmprestados(int exemplaresEmprestados) {
        this.exemplaresEmprestados = exemplaresEmprestados;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalExemplares() {
        return totalExemplares;
    }

    public void setTotalExemplares(int totalExemplares) {
        this.totalExemplares = totalExemplares;
    }
    public LivroPergamum(){}

    public  LivroPergamum (int codigo, String titulo, String autor, String isbn, int totalExemplares, int exemplaresEmprestados) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.exemplaresEmprestados = exemplaresEmprestados;
        this.totalExemplares = totalExemplares;
    }

    public int livrosDisponiveis() {
        return totalExemplares - exemplaresEmprestados;
    }

    public String imprimirDadosLivro ( ){
        return "Titulo: " +titulo +"\nAutor: " +autor + "\nISBN: " +isbn + "\nTotal exemplares: " +totalExemplares +"\nExemplares Emprestados: " +exemplaresEmprestados;
    }

    public boolean isDisponivel () {
        return livrosDisponiveis() > 0;
    }

    public void setDisponivel (boolean isDisponivel) {
        if(isDisponivel) {
            exemplaresEmprestados--;
        }
        exemplaresEmprestados++;
    }

}
