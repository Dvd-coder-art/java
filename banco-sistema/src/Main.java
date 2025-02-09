public class Main {

    public static void main(String[] args) {
        Cliente david = new Cliente();
        david.setNome("David");

        Conta cc = new ContaCorrente(david);
        Conta poupanca = new ContaPoupanca(david);

        cc.depositar(500);
        cc.transferir(300,poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
