import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};

        double media = calculadoMediaDaTurma(alunos, scan);

        System.out.println("Media da turma " + media);
    }

    public static double calculadoMediaDaTurma(String[] alunos, Scanner scanner){
        double soma = 0;
        for(String aluno : alunos){
            System.out.println("Nota do aluno: " + aluno);
            double nota = scanner.nextDouble();
            soma += nota;


        }

        return soma / alunos.length;
    }
    
}