import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, fatorial = 1;
        System.out.println("Digite um numero para ser calculado seu fatorial");
        num = scanner.nextInt();
        for (int i = num ;i >=1 ; i--){
            fatorial *= i;
        }
        System.out.println("O fatorial de " + num +" é " + fatorial);
    }
}
