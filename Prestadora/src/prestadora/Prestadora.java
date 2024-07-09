package prestadora;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Prestadora {

    public static void main(String[] args) throws FileNotFoundException {
        servico serv[] = lerdados();
    }

    public static servico[] lerdados() throws FileNotFoundException {
        File arq = new File("dados");
        Scanner scan = new Scanner(arq);

        servico serv[] = new servico[9];
        for (int i = 0; i < serv.length; i++) {
            serv[i] = new servico(scan.nextInt(), scan.next(),
                    scan.next(), scan.nextInt());

            System.out.printf("%12d %12s %12s %12d\n", serv[i].getCodServico(),
                    serv[i].getCliente(), serv[i].getDescricao(),
                    serv[i].getQtdHoras());

        }
        return serv;
    }

    public static void infoCliente(servico serv[], String cli[]) {
        boolean achou = false;
        double valor = 0;
        for (int i = 0; i < serv.length; i++) {

            if (cli.equals(serv[i].getCliente())) {
                achou = true;
                valor = serv[i].valorServico();
                System.out.println(serv[i].getCliente() + "  " + serv[i].getDescricao()
                        + serv[i].valorServico());

            }
            if (!achou) {
                System.out.println("Cliente não encontrado");
            }
        }   
        }
         public static void calcTotais(servico serv[]){
            int somaHP=0, somaHF=0, somaHJ=0;
            double somaValp=0, somaValf, somaValj=0;
            
             for (int i = 0; i < serv.length; i++) {
                 if(serv[i].getDescricao().equals("pintura")){
                     somaHP+=serv[i].getQtdHoras();
                 }else if (serv[i].getDescricao().equals("faxina"))
                     somaHF+=serv[i].getQtdHoras();
                  else{
                        somaHJ+=serv[i].getQtdHoras();
                         
                 }
                         }
              double totalP=somaHP*30;
              double totalF=somaHF*20;
              double totalJ=somaHJ*10;
                     System.out.println("");
                     System.out.println("");
                     System.out.println("");
                 
             }
            

    }

