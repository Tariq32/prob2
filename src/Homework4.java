import java.util.Scanner;
public class Homework4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1-20");
        int n = scan.nextInt();
        int[] interArray = new int[n];
        for (int i = 0; i <=n-1; i++) {

            System.out.println((int) Math.pow(2, i));

        }

    }

}
