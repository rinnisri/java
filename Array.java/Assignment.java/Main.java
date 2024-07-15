import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, k;
        
        System.out.println("enter a number:");
       
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
       
        
        k = 2 * n - 1;
        int a [][] = new int[k][k];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                if (j >= i && j <= k - i - 1) {
                    a[i][j] = n - i;
                } else {
                    if (j < k / 2)
                        a[i][j] = n - j;
                    else {
                        a[i][j] = j - n + 2;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < k; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

