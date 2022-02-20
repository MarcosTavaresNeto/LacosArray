import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] consoantes = new String[6];
        int quantidadeConsoantes =0;
        String letra;
        int cont =0;
        do{
            System.out.println("digite uma letra");
            letra = scanner.next();
            if(!(letra.equalsIgnoreCase("a")||
                    letra.equalsIgnoreCase("e")||
                    letra.equalsIgnoreCase("i")||
                    letra.equalsIgnoreCase("o")||
                    letra.equalsIgnoreCase("u"))){
                quantidadeConsoantes++;
                consoantes[cont] = letra;
            }
            cont++;
        }while(cont < consoantes.length);
        System.out.println("Consoantes: ");
        for(String consoante : consoantes){
            if(consoante != null)
            System.out.print(consoante + " ");
        }
        System.out.println("Foram digitados " + quantidadeConsoantes + " Consoantes");

    }
}
