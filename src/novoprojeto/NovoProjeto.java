package novoprojeto;

import java.math.BigDecimal;
import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class NovoProjeto {

    public static void main(String[] args) {

        menu();//chamada do metodo 

    }

    public static void menu() {
        Scanner valores = new Scanner(System.in);
        Scanner nomes = new Scanner(System.in);
        Vendedor vendedor;
        Endereco ender;
        int opcao;
        int resp;

        do {

            System.out.println("----------------LOJA MARANHAO-----------------");
            System.out.println("1 - cadastrar vendedor");
            System.out.println("2 - lista vendedores");
            System.out.println("0 - sair");

            System.out.println("Escolha uma opcao :");
            opcao = valores.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("--------CADASTRO DE VENDEDORES--------");
                    System.out.println("Digite  o nome do vendedor :");
                    String nome = nomes.nextLine();
                    System.out.println("Digite o cpf :");
                    String cpf = nomes.nextLine();

                    System.out.println("Digite a data de nascimento :");
                    String data = nomes.nextLine();

                    DateTimeFormatter formatar = DateTimeFormatter.ofPattern("ddMMyyyy");
                    LocalDate nascimento = LocalDate.parse(data, formatar);

                    // lista para receber os contatos
                    List<String> tele = new ArrayList();
                    do {
                        System.out.println("Digite o numero de telefone :");
                        String numero = nomes.nextLine();

                        tele.add(numero);

                        System.out.println("Deseja cadastrar outro telefone ? (1 - sim || 2 - nao ) :");
                        resp = valores.nextInt();

                    } while (resp != 2);

                    
                    System.out.println("-----------DADOS DO ENDERECO----------");
                    System.out.println("Digite o nome da cidade :");
                    String cidade = nomes.nextLine();
                    System.out.println("Digite o bairro :");
                    String bairro = nomes.nextLine();
                    System.out.println("Digite o nome da rua :");
                    String rua = nomes.nextLine();
                    System.out.println("Digite o numero da casa :");
                    int numero = valores.nextInt();
                    
                    System.out.println("Digite o codigo do vendedor :");
                    int codigo = valores.nextInt();
                    System.out.println("Digite o salario :");
                    BigDecimal salario = valores.nextBigDecimal();
                    
                    // instancias
                    ender = new Endereco(cidade , bairro , rua , numero);
                    vendedor = new Vendedor(nome , cpf ,nascimento , tele , ender , codigo , salario); 
                    ListaFuncionario.adicionarFuncionario(vendedor);
                    break;

                case 2:
                    System.out.println("----------LISTA DE VENDEDORES---------");
                    System.out.println(ListaFuncionario.imprimirDadosVendedor());
                    break;
            }

        } while (opcao != 0);

    }

}
