import java.util.Scanner;
public class prob4 {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        // initialized n,sum,remainder on 1 line
        int n = scan.nextInt(),sum =0 ,remainder;
        // while number is > 0 ,divide number by 10 ,add remainder to sum, keep dividing remaining number by 10
        while (n >0 ) {
            remainder = n % 10;
            sum = sum + remainder;
            n /= 10;
        }
        System.out.println("Sum of the  numbers are:" +sum);
    }
}
