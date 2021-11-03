import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        System.out.print("Ile liczb wczytać: ");
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        int tmp=0;

        for(int i=0; i<n; i++)
        {
            System.out.print("Podaj liczbę: ");
            tmp = sc.nextInt();

            arr[i] = tmp;
        }

        showPrimes(arr);
    }


    public static void showPrimes(int[] list)
    {
        boolean isPrime = true;

        for (int k : list) {
            for (int j = 2; j < k; j++) {

                if(k % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime && k !=1)
                System.out.println(String.valueOf(k));
            isPrime = true;
        }
    }
}