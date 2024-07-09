package leonardoloja2.p2;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class LeonardoLoja2P2 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        vendas vend[] = lerdados();

//        int opcao;
//
//        do {
//            System.out.println("Menu\n"
//                    + "1-Valor a receber\n"
//                    + "2-Total Caixa\n"
//                    + "3-Maior valor base\n"
//                    + "4-Sair");
//            opcao = scan.nextInt();
//
//            switch (opcao) {
//                case 1:
//                    System.out.println("Digite o nome do cliente");
//                    String nome=scan.next();
//                    
//                    for (int i = 0; i < vend.length; i++) {
//
//                        
//                    }
//
//            }
        }   
    

    public static vendas[] lerdados() throws FileNotFoundException {
        vendas vend[] = new vendas[8];
        File arq = new File("dados");
        Scanner scan = new Scanner(arq);

        for (int i = 0; i < vend.length; i++) {
            vend[i] = new vendas(scan.next(), scan.nextDouble(), scan.nextInt());

            System.out.printf("%10s %10.2f\n %10d", vend[i].getCliente(),
                    vend[i].getValorbase(), vend[i].getNumprest());

        }
        return vend;
    }
//
//    public static double valortotal(double Vt) {
//        double (Vt = 150 + vend[i].getValorbase());
//    

    

  
       
            
        

    
}
