public abstract class Livro {
    protected String titulo;
    protected String autor;
    protected int isbn;
    protected Status status;

    public enum Status{
        DISPONIVEL,
        INDISPONIVEL;
    }

    public Livro(String titulo, String autor, int isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.status = Status.DISPONIVEL;
    }

    //deverá ser implementado nas subclasses
    public abstract String reservar();

    public String devolver(){
        this.status = Status.DISPONIVEL;
        return "Devolucao Concluida";
    }

}
