 package sandra;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sandra {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        Produto prod[] = lerDados();

        int opcao;

        do {
            System.out.println("Menu\n"
                    + "1 – Efetuar venda\n"
                    + "2 – Verificar estoque\n"
                    + "3 – Sair\n"
                    + "Digite a opção desejada:");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o código");
                    int codDig = scan.nextInt();

                    int ind = -1;
                    for (int i = 0; i < prod.length; i++) {
                        if (codDig == prod[i].getCodigo()) {
                            ind = i;
                            break;
                        }
                    }

                    if (ind == -1) {
                        System.out.println("Código inexixtente");
                    } else {
                        System.out.println("Digite a quantidade");
                        int qtd = scan.nextInt();
                        if (prod[ind].haEstoque(qtd)) {
                            System.out.println("Valor compra: " + 
                                    prod[ind].calcValor(qtd));
                        }
                        else{
                            System.out.println("estoque insuficiente");
                        }
                    }

                    /* 7
                 Na opção 1, solicite que o usuário digite 
                o código do produto. Se o código informado for 
                válido, solicite que o usuário digite a
                quantidade desejada, verifique se há estoque 
                (chamando o método implementado no item 2) e, 
                se houver, efetue a venda e exiba o valor a 
                ser pago pelo cliente (use o método do item 3). 
                Se o estoque não for suficiente, exiba a 
                mensagem “Estoque suficiente”. Se o 
                código informado for inválido, exiba a 
                mensagem “Código inexistente”
                     */
                    break;
                    
                case 2:
                    System.out.println("Situação do estoque");
                    for(Produto p: prod){
                        System.out.println(p.getDescricao() + 
                                "   " + p.situacaoEstoque());
                    }
                    break; 
                    
                case 3:
                    System.out.println("Encerrando o sistema");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

        } while (opcao != 3);

    }

    public static Produto[] lerDados() throws FileNotFoundException {
        Produto prod[] = new Produto[8];
        File arq = new File("dados");
        Scanner scan = new Scanner(arq);

        for (int i = 0; i < prod.length; i++) {
            prod[i] = new Produto(scan.nextInt(), scan.next(),
                    scan.nextInt(), scan.nextInt(), scan.nextDouble());

            System.out.printf("%10d %10s %10d %10d %10.2f\n",
                    prod[i].getCodigo(), prod[i].getDescricao(),
                    prod[i].getEstoqueMinimo(),
                    prod[i].getEstoque(), prod[i].getPrecoUnit());
        }
        return prod;
    }

}
