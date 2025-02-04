import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
            // Chamando o método com a lógica de contagem
            contar(parametroUm, parametroDois);
            System.out.println("Contagem de " + parametroUm + " a " + parametroDois);
            for(int i=parametroUm; i<=parametroDois; i++){
                System.out.println(i+"\n");
            }
        } catch (IllegalArgumentException excecao) {
            // Imprimir a mensagem: "O segundo parâmetro deve ser maior que o primeiro"
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
		
	}
	
    static void contar(int parametroUm, int parametroDois) throws IllegalArgumentException {
        // Validar se o segundo parâmetro é maior que o primeiro
        if (parametroDois <= parametroUm) {
            throw new IllegalArgumentException(); // Lançar exceção caso a validação falhe
        }
        // A lógica de contagem é realizada no método main através do laço for
    }
}