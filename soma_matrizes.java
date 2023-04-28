import java.util.Locale;
import java.util.Scanner;

public class soma_matrizes {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int linha, coluna;

        System.out.print("Quantas linhas vai ter cada matriz? ");
        linha = sc.nextInt();
        System.out.print("Quantas colunas vai ter cada matriz? ");
        coluna = sc.nextInt();

        int[][] a = new int[linha][coluna];
        int[][] b = new int[linha][coluna];
        int[][] c = new int[linha][coluna];

        System.out.println("Digite os valores da matriz A:");

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.printf("Elemento [%d,%d]: ", i, j);
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Digite os valores da matriz B:");

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.printf("Elemento [%d,%d]: ", i, j);
                b[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("MATRIZ SOMA:");

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.printf("%d ", c[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}