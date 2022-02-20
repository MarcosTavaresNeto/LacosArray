import java.util.Scanner;

public class MaiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double vlr, maior=0, media=0;
        int cont = 0;
        do{
            System.out.println("Digite um valor:");
            vlr = scan.nextDouble();
                if(cont == 0) maior= vlr;
            if(maior < vlr)
                maior = vlr;
            media += vlr;
            cont++;
        }while (cont < 5);

        media /= cont;
        System.out.println("O maior valor é: "+ maior + " e a média é:"+ media);



    }
}
