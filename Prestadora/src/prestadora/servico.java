package prestadora;

public class servico {

    private int codServico;
    private String cliente;
    private String descricao;
    private int qtdHoras;

    public servico(int codServico, String cliente, String descricao, int qtdHoras) {
        this.codServico = codServico;
        this.cliente = cliente;
        this.descricao = descricao;
        this.qtdHoras = qtdHoras;
    }

    public double valorServico() {
        double valors;
        if (descricao.equals("pintura")) {
            valors = qtdHoras * 30;
        } else if (descricao.equals("Faxina")) {

            valors = qtdHoras * 20;
        } else {

            valors = qtdHoras * 10;
        }

        return valors;
    }

    public int getCodServico() {
        return codServico;
    }

    public void setCodServico(int codServico) {
        this.codServico = codServico;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(int qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

}
