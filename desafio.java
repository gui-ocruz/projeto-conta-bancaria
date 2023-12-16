import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {

        //Declaração da variáveis
        String nomeCliente = "Bruce Wayne";
        String tipoConta = "Corrente";
        double saldoInicial = 2500.00;
        int opcao = 0;
        Scanner leitura = new Scanner(System.in);

        System.out.println("*********************");
        System.out.println("\nNome do cliente: " + nomeCliente);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saldo inicial: R$" + saldoInicial);
        System.out.println("\n*********************");

        String menu = """
               ** Digite uma das opções **
               
               1 - Consultar saldo
               2 - Transferir valor
               3 - Receber valor
               4 - Sair
                """;

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo da conta é de R$" + saldoInicial);
            } else if (opcao == 2) {
                System.out.println("Digite o valor a ser transferido");
                double valor = leitura.nextInt();
                if (valor > saldoInicial) {
                    System.out.println("Não é possível realizar essa operação");
                } else {
                    saldoInicial -= valor;
                }
            } else if (opcao == 3) {
                System.out.println("Digite o valor a ser recebido");
                double receber = leitura.nextInt();
                saldoInicial += receber;
            } else if (opcao == 4) {
                System.out.println("Aplicação encerrada");
            } else {
                System.out.println("Opção inválida");
            }
        }
    }
}