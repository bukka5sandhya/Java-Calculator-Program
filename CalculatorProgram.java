import java.util.Scanner;
public class CalculatorProgram{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two Numbers: ");
        double first = input.nextDouble();
        double second = input.nextDouble();
        System.out.print("Enter a operator (+, -, *, /): ");
        char operators = input.next().charAt(0);
        double result ;
        switch(operators){
            case '+':
            result = first+second;
            break;
            case '-':
            result = first-second;
            break;
            case '*':
            result = first*second;
            break;
            case '/':
            result = first/second;
            break;
            // operator doesn't match any case constant (+, -, *, /)
            default:
            System.out.println("Error! operator is not correct");
            return;



        }
        //printing the result of the operations
        System.out.printf("%.1f %c %.1f = %.1f", first, operators, second, result);

    }
}