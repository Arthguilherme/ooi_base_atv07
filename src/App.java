import java.util.ArrayList;
import java.util.Scanner;

public class App {

    static Scanner teclado = new Scanner(System.in);
    static ContaBancaria conta;

    static Banco banco = new Banco("TADSBank");

    static String imprimirMenu(){
        String str="";
        str += "###----###\n";
        str += "1 - Cadastrar conta\n";
        str += "2 - Sacar\n";
        str += "3 - Depositar\n";
        str += "4 - Ver dados\n";
        str += "0 - Sair\n";
        str += "Digite uma opção:";

        return str;
    }


    static void criarConta(){
        
        String nomeCliente;
        String numero;
        String agencia;
        double saldoInicial;
        
        System.out.println("Digite o nome do cliente:");
        nomeCliente = teclado.nextLine();
        System.out.println("Digite o número da conta:");
        numero = teclado.nextLine();
        System.out.println("Digite a agência da conta:");
        agencia = teclado.nextLine();


        conta = new ContaBancaria(agencia,numero,nomeCliente);

        System.out.println("************");
        
        //adicionando um conta na coleção de contas
        banco.criarConta(conta);


    }

    static void sacar(){
        double valor;
        String numero;
        String agencia;
        

        System.out.println("Digite o numero da conta:");
        numero = teclado.nextLine();
        
        System.out.println("Digite o numero da agencia:");
        agencia = teclado.nextLine();
        

        System.out.println("Digite um valor:");
        valor = teclado.nextDouble();


        System.out.println(banco.sacar(numero, agencia, valor));

        System.out.println("************");
    }

    static void depositar(){
        double valor;
        String numero;
        String agencia;
        

        System.out.println("Digite o numero da conta:");
        numero = teclado.nextLine();
        
        System.out.println("Digite o numero da agencia:");
        agencia = teclado.nextLine();
        

        System.out.println("Digite um valor:");
        valor = teclado.nextDouble();

        String retorno = banco.depositar(numero,agencia,valor);
        System.out.println(retorno);
        System.out.println("************");
    }

    static void mostrarDados(){
        
        System.out.println(banco.relatorio());
    }

    public static void main(String[] args) {






        int opcao=0;

        do{
            System.out.println(imprimirMenu());
            opcao = teclado.nextInt();
            teclado.nextLine();

            switch(opcao){
                case 1:
                    criarConta();
                break;
                case 2:
                    sacar();
                    
                break;
                case 3:
                    depositar();
                break;
                case 4:
                    mostrarDados();
                break;
                default:
                    if(opcao != 0){
                        System.out.println("Opção inválida!!");
                    }
            }
        }while(opcao != 0);
    }
}
