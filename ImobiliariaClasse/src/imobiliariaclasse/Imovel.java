package imobiliariaclasse;

public class Imovel {
    int cod;
    char categoria ;
    double aluguelBase;
    String situacao;

    public Imovel(int cod, char categoria, double aluguelBase, String situacao) {
        this.cod = cod;
        this.categoria = categoria;
        this.aluguelBase = aluguelBase;
        this.situacao = situacao;
    }   
}
