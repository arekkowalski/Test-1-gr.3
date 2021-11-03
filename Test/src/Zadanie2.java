import java.util.Random;
import java.util.Scanner;

public class Zadanie2 {

    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(10 - 1) + 1;
        int[] tab = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            tab[i] = r.nextInt(50 + 50) - 50;
            System.out.println(tab[i]);
        }

        int counter1 = 0;
        int max = tab[0];
        for (int i = 0; i <= n - 2; i++) {
            if (max < tab[i + 1])
                max = tab[i + 1];
        }
        for (int i = 0; i <= n - 1; i++) {
            if (tab[i] == max)
                counter1++;
        }
        System.out.println("max = " + max);
        System.out.println("ilosc max w tablicy: " + counter1);
    }
}