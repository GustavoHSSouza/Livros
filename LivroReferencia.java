public class LivroReferencia extends Livro {
    protected Tema tema;

    public enum Tema{
        FISICA,MATEMATICA;
    }

    public LivroReferencia(String titulo, String autor, int isbn, Tema tema){
        super(titulo,autor,isbn);
        this.tema = tema;
    }
    public String reservar(){
        return "Não é possível reservar livros de referencia";
    }
    
}
