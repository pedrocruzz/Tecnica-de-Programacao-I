import java.util.Scanner;

public class ContaTeste {
    public static Conta conta1 = new Conta();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = 0;
        while(numero != 5) {
            System.out.println(
                    "========================\n" +
                    "Digite 1 para Sacar\n" +
                    "Digite 2 para Depositar\n" +
                    "Digite 3 para Consultar\n" +
                    "Digite 4 para Cadastrar\n" +
                    "Digite 5 para Sair\n")
                    ;
            numero = scan.nextInt();
            switch (numero) {
                case 1:
                    execSacar(conta1);
                    break;
                case 2:
                    execDepositar();
                    break;
                case 3:
                    execConsultar();
                    break;
                case 4:
                    execCadastrar();
                    break;
                case 5:
                    System.out.println("Saindo..");
                    break;
                default:
                    System.out.println("Não existe esse metodo correspondente ao número escolhido! Digite um número entre 1 a 4.");
            }
        }
    }

    private static void execConsultar() {
        conta1.imprimir();
    }

    private static void execCadastrar() {
        Scanner scannerConta = new Scanner(System.in);
        System.out.print("Qual é a sua conta: ");
        String contaNome = scannerConta.next();
        conta1.setConta(contaNome);

        Scanner scannerAgencia = new Scanner(System.in);
        System.out.print("Qual é a sua agencia: ");
        String agenciaNome = scannerAgencia.next();
        conta1.setAgencia(agenciaNome);

        conta1.setSaldo(0.0);

        Scanner scannerUsuario = new Scanner(System.in);
        System.out.print("Qual é seu nome: ");
        String usuarioNome = scannerUsuario.next();
        conta1.setNomeCliente(usuarioNome);

        System.out.println("Informacoes Cadastradas com sucesso");
    }

    private static void execDepositar() {
        System.out.printf("Digite um valor para ser depositado: ");
        Scanner depo = new Scanner(System.in);
        double depoVal = depo.nextDouble();
        conta1.depositarValor(depoVal);
    }

    private static void execSacar(Conta conta1) {
        System.out.printf("Digite um valor para ser sacado: ");
        Scanner input = new Scanner(System.in);
        double val = input.nextDouble();
        conta1.sacarValor(val);
    }
}