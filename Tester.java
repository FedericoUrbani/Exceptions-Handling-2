import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("insert dividend");
            int dividend= scan.nextInt();
            System.out.println("insert divisor");
            int divisor= scan.nextInt();
            if(divisor==0){
                throw new ArithmeticException("divisor can't be 0");
            }else
            System.out.println("the result of the division is "+dividend/divisor);
        }
    }

}
