import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        /*Tabuada: Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro
         entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser
         conforme o exemplo abaixo:*/
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero de 1 até 10 para fazer a tabuada");
        num = scanner.nextInt();
        while(num <0 || num >10){
            System.out.println("Numero Incorreto - Digite um numero de 1 até 10 para fazer a tabuada");
            num = scanner.nextInt();
        }
        for(int i=0;i<10;i++){
            System.out.println(num + " X " + (i+1) + " = " + (num * (i+1)));
        }
    }
}
