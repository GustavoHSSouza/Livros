public class Main {
    public static void main(String[] args){
        LivroPadrao livro1 = new LivroPadrao("abc","Joao",1234);
        LivroPadrao livro2 = new LivroPadrao("yba","Maria",12345);
        LivroReferencia livro3 = new LivroReferencia("ggg","Claudia",12345,LivroReferencia.Tema.FISICA);
        Usuario user = new Usuario(234, "Nilton");
        System.out.println(user.fazerReserva(livro2));
        System.out.println(user.fazerReserva(livro3));
        System.out.println(user.fazerDevolucao(livro3));
    }
}
