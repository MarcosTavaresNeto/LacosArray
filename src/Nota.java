import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota;
        System.out.println("Dê uma nota [0-10] para o aluno");
        nota = scanner.nextInt();
        while (nota < 0 || nota > 10){
            System.out.println("Nota inválida dê uma nota [0-10]");
            nota = scanner.nextInt();
        }
        System.out.println("Nota do aluno = "+nota);
    }
}
