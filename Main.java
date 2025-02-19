import java.util.Scanner;

public class Main {
    public static void bubble(int[] a, int n){
        for(int i = n -2; i >= 0; i--){
            for(int j = 0; j <= i; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\nEnter number of integer elements to be sorted:  ");
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
        {
            System.out.println("\n\nEnter integer value for element no. " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }

        bubble(a, n);

        System.out.println("\n\nFinally sorted array is: ");
        for(int i = 0; i < n; i++){
            System.out.println(a[i] + " ");
        }
        sc.close();
    }

}
