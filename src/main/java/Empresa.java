import java.util.Observable;

public class Empresa extends Observable {

    private String nome;
    private String gerente;

    public Empresa(String nome, String gerente){
        this.gerente = gerente;
        this.nome = nome;
    }

    public void novaResposta(){
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString(){
        return this.nome + ", gerente: " + this.gerente;
    }
}
