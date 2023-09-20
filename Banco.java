import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Dados Iniciais do Cliente");
        System.out.println("Digite o nome do titular :");
        String Nome = leitura.nextLine();
        System.out.println("Digite o tipo da conta (Corrente/Poupança");
        String tipo = leitura.nextLine();
        System.out.println("Saldo inicial da conta");
        double saldoinicial =  leitura.nextDouble();
        double novosaldo = 0;
        double soma = 0;
        double menos =0;
        int opcao ;
        do {
            String operacoes = """
                    Operações
                                    
                    1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                    """;
            System.out.println(operacoes);
            opcao = leitura.nextInt();
            leitura.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println("Saldo disponivel :" + ((saldoinicial+soma) - menos));
                    break;

                case 2:
                    System.out.println("Digite o valor a que ira ser depositado :");
                    double valorAmais = leitura.nextDouble();
                    soma = saldoinicial + valorAmais;
                    System.out.println("Novo saldo :"+soma);
                    break;

                case 3:
                    System.out.println("Digite o valor da transferencia :");
                    double transferencia = leitura.nextDouble();
                    menos = soma- transferencia;
                    System.out.println("Novo saldo :"+menos);
                    break;
                case 4:
                    System.out.println("Finalizou o sistema !");
                    break;
                default:
                    System.out.println("Opcao Invalida");

            }
        }while (opcao != 4);
        leitura.close();
    }
}
