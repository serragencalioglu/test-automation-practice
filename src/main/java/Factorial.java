import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int givenNumber = scanner.nextInt();

        System.out.println(getFactorial(givenNumber));
    }

    public static int getFactorial(int number){
        if (number == 0)
            return 1;

        return number*getFactorial(number-1);
    }
}
