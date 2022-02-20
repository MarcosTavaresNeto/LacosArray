import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num ;
        int rep, cont=0, par=0, impar=0;
        System.out.println("Digite o quantidade de numeros a ser informada");
        rep = scanner.nextInt();
        do {
            System.out.println("digite o " + (cont+1) + "º numero:");
            num = scanner.nextDouble();
            if(num%2==0){
                par++;
            }
            else {
                impar++;
            }
            cont++;
        }while(cont < rep);
        System.out.println("Dos numeros digitados tem "+ par + " Par(es) e " + impar + " Impar(es)");


    }
}
