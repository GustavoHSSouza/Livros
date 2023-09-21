public class Usuario {
    private int id;
    private String nome;
    public Usuario(int id,String nome){
        this.id = id;
        this.nome = nome;
    }
    public String fazerReserva(Livro livro){
        return livro.reservar();
    }
    public String fazerDevolucao(Livro livro){
        return livro.devolver();
    }
}
