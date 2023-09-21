import java.util.Calendar;
import java.util.Date;

public class LivroPadrao extends Livro{
    private Date dataDevolucao;
    public LivroPadrao(String titulo, String autor, int isbn){
        super(titulo,autor,isbn);
        this.dataDevolucao = null;
    }
    @Override
    public String reservar(){
        if(this.status==Status.DISPONIVEL){
            this.status = Status.INDISPONIVEL;
            Calendar c = Calendar.getInstance();
            c.add(Calendar.DATE, 7);
            this.dataDevolucao = c.getTime();
            return "Livro reservado - devolucao em:" + this.dataDevolucao;
        }else{
            return "Livro indisponível";
        }
    }
}
