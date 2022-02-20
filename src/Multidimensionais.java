import java.util.Random;

public class Multidimensionais {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        Random random = new Random();
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                matriz[i][j]= random.nextInt(9);
            }
        }
        for(int[] linha : matriz){
            for (int elemento : linha) System.out.print(elemento + " ");
            System.out.println();
        }
    }
}
