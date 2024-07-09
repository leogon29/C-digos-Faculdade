package leonardoloja2.p2;

public class vendas {

    private String cliente;
    private double valorbase;
    private int numprest;
//2    

    public double calcvenda(int qtd) {
        if (numprest == 1) {
            return (valorbase - (valorbase * 0.05));
        } else if (numprest == 2) {
            return (valorbase);
        } else {
            return (valorbase + (valorbase * 0.05));
        }

    }

    public vendas(String cliente, double valorbase, int numprest) {
        this.cliente = cliente;
        this.valorbase = valorbase;
        this.numprest = numprest;
    }

    public int getNumprest() {
        return numprest;
    }

    public void setNumprest(int numprest) {
        this.numprest = numprest;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getValorbase() {
        return valorbase;
    }

    public void setValorbase(double valorbase) {
        this.valorbase = valorbase;

    }
}
