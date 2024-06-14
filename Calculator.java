import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Calculator
{
    public static void main(String[] args)
    {

               //input the operator as input
             Scanner in = new Scanner(System.in);
             while(true)
            {
                int ans = 0;
                System.out.println("Enter operator:");
                char op = in.next().trim().charAt(0);
                if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%')
                {
                    System.out.println("Enter the inputs:");
                    int num1 = in.nextInt();
                    int num2 = in.nextInt();
                    if (op == '+')
                       ans = num1 + num2;
                    if (op == '-')
                       ans = num1 - num2;
                    if (op == '*')
                       ans = num1 * num2;
                    if (op == '/')
                       ans = num1 / num2;
                    if (op == '%')
                       ans = num1 % num2;
                }
                else if(op == 'x' || op == 'X')
                {
                    break;
                }
                else
                {
                    System.out.println("Invalid Operation");
                }
                System.out.println(ans);
            }
    }
}