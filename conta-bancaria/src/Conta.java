import java.util.Locale;
import java.util.Scanner;


public class Conta{
    public static void main(String[] args) throws Exception {
        //TODO: conhecer a classe scanner
       
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome: ");
        String nomeCliente= scanner.next();
        System.out.println("Digite seu Sobrenome: ");
        String SobrenomeCliente= scanner.next();

        System.out.println("Digite seu agência: ");
        String agencia= scanner.next();
        System.out.println("Digite o número da conta: ");
        String numeroConta= scanner.next();

        System.out.println("Quanto você quer depositar? ");
        double saldo = scanner.nextDouble();


        System.out.println("Olá "+ nomeCliente + ", seja bem-vindo");
        System.out.println("Agência: " + agencia);
        System.out.println("Conta: " + numeroConta);
        System.out.println("Saldo: " + saldo);


        System.out.println("Você deseja: [1] sacar\n [2] depositar \n [3] sair");
        int resposta = scanner.nextInt();

        if(resposta == 1){
            System.out.println("Quanto você quer sacar? ");
            double sacar = scanner.nextDouble();

            saldo= saldo - sacar;

            System.out.println("Seu saldo atual: "+saldo);
        }else if(resposta == 2){
            System.out.println("Quanto você quer depositar? ");
            double depositar = scanner.nextDouble();

            saldo = saldo + depositar;
            System.out.println("Seu saldo atual: "+saldo);
        }else{
            System.out.println("Até a proxima, programa encerrado");
        }
        //TODO: exibir as mensagens para usuario
        //TODO: obter pela classe scanner os valores digitados
        //TODO: exibir o resultado final
    }
}
