import java.util.Scanner;

public class CalculaterApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1.Add");
        System.out.println("2.Substract");
        System.out.println("3.Multiply");
        System.out.println("4.Divide");

        int choice = sc.nextInt();

        System.out.print("Enter First Number: ");
        double num1=sc.nextDouble();

        System.out.print("Enter Second Number: ");
        double num2=sc.nextDouble();

        Calculater operation = null;
        switch(choice){
            case 1:
            operation = new Add();
            break;
            case 2:
            operation = new Substract();
            break;
            case 3:
            operation = new Multiply();
            break;
            case 4:
            operation = new Divide();
            break;
            default:
            System.out.println("Invalid choice");
            System.exit(0);
        }
        try{
        double result = operation.calculate(num1, num2);
        System.out.println("result : " +result);
        }catch(ArithmeticException e){
            System.out.println("Error" + e.getMessage());
        }

        sc.close();
    }
    
}
