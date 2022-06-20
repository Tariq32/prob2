
import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a Number: ");
//get input from user
        int n = scan.nextInt();
        //initialized sum
        int sum = 0;
        //initialized i, set equal to 1, if i is < user input ,and input is divisible by i with a remainder of 0 print i
       //add 1 to i, put i results into sum
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i + ",");
                sum += i;
            }
        }
        System.out.println("Sum of factors" + sum);
    }
}







