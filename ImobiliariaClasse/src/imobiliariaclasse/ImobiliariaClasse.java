package imobiliariaclasse;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ImobiliariaClasse{

    public static void main(String[] args) {
        Imovel imo[]= new Imovel[8];
        
        try {
        lerdados(imo);
        exibir(imo);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void lerdados(Imovel imo[]) throws FileNotFoundException{
       File arq = new File("dados");
       Scanner scan = new Scanner(arq); 
       
            for (int i = 0; i < imo.length; i++) { 
                imo[i] = new Imovel(scan.nextInt(), scan.next().charAt(0),                
                                    scan.nextDouble(), scan.next());                       
}
}
    public static void exibir(Imovel imo[]){
         for (int i = 0; i < imo.length; i++) {
        System.out.printf("%14d %14c %14.2f %14s\n",
                         imo[i].cod, imo[i].categoria,
                         imo[i].aluguelBase, imo[i].situacao);    
    }
}
}
