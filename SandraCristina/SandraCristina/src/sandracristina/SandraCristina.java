package sandracristina;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class SandraCristina {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);        
        Consulta con[] = lerDados();
        int opcao;        
        
        do{
        System.out.println("\nMenu\n"
                + "1 – Listar pacientes e valores\n"
                + "2 – Porcentagem retorno\n"
                + "3 – Sair\n"
                + "Digite a opção desejada:");
        opcao = scan.nextInt();
        
        switch(opcao){
            case 1:
                System.out.println("Digite o convênio");
                int conv = scan.nextInt();
                exibePagamentos(con, conv);
                break;
            case 2:
                System.out.println("Porcentagem de retornos: " +
                        calcPerc(con));
                break;
            case 3:
                System.out.println("Sair");
                break;
            default:
                 System.out.println("Valor inválido");
                 break;
        }        
        }while(opcao != 3);
    }
    public static double calcPerc(Consulta con[]) {
        int cont = 0;
        for (int i = 0; i < con.length; i++) {
            if (con[i].getCategoria()== 'r') {
                cont++;
            }
        }
        return (double) cont / con.length * 100;
    }
    public static void exibePagamentos(Consulta con[], int conv) {
        boolean achou = false;
        for (Consulta c : con) {
            if (conv == c.getConvenio()) {
                achou = true;
                System.out.println(c.getPaciente() + "  " + c.calcConsulta());
            }
        }
        if (!achou) {
            System.out.println("Convênio não encontrado");
        }
    }
    public static Consulta[] lerDados() throws FileNotFoundException {
        File arq = new File("dados");
        Scanner scan = new Scanner(arq);

        Consulta con[] = new Consulta[10];

        for (int i = 0; i < con.length; i++) {
            con[i] = new Consulta(scan.next(), scan.nextInt(),
                    scan.nextDouble(), scan.next().charAt(0));

            System.out.printf("%10s %10d %10.2f %10c\n",
                    con[i].getPaciente(), con[i].getConvenio(),
                    con[i].getValorBase(), con[i].getCategoria());
        }
        return con;
    }
}