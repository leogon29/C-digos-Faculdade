package clinica;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Clinica {

    public static void main(String[] args) throws FileNotFoundException {
        Consulta con[] = lerDados();

    }

    public static Consulta[] lerDados() throws FileNotFoundException {
        File arq = new File("dados");
        Scanner scan = new Scanner(arq);

        Consulta con[] = new Consulta[10];
        for (int i = 0; i < 10; i++) {
            con[i] = new Consulta(scan.next(), scan.nextInt(), scan.nextDouble(),
                    scan.next().charAt(0));
            System.out.printf("%10s %10d %10.2f %10c\n",
                    con[i].getPaciente(), con[i].getConvenio(), con[i].getValorBase(),
                    con[i].getCategoria());
        }
        return con;
    }

}
