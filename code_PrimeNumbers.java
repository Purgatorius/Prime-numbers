import java.util.Scanner;

/**
 * Created by B4RT on 2017-06-07.
 */
public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hi! I'll check for you, that your number is a prime number");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int limit = n/2;
        boolean isPrime = true;
        String yes = "Number " + n + " is prime";
        String no = "Number " + n + " is not prime";

        if(n==0||n==1||n==4)
            isPrime = false;
        else if (n==2||n==3)
            isPrime = true;
        else { //algorithm starts for numbers that are bigger than 4
            for (int i = 2; i < limit; i++) {
                if (n % i == 0){ //firts step of the loop we're checking that number is able to divide by 2
                    isPrime = false;
                    break;

                }
            }
        }

        if (isPrime)
            System.out.println(yes);
        else
            System.out.println(no);
    }
}
