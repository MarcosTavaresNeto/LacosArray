import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        int[] aleatorios = new int[20];
        for(int i=0;i<aleatorios.length;i++){
            aleatorios[i] = random.nextInt(100);

        }
        for (int aleatorio : aleatorios) {
            System.out.println("Numero gerado = " + aleatorio + " Sucessor = " + (aleatorio + 1));
        }
    }
}
