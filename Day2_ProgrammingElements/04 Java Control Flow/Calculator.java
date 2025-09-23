import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double first =sc.nextInt();
        double second =sc.nextInt();
        char op=sc.next().charAt(0);
        switch (op){
            case '+':
            System.out.println("summ= "+(first+second));
            break;
            case '-':
             System.out.println("diff= "+(first-second));
            break;
            case '*':
             System.out.println("product= "+(first*second));
            break;
            case '/':
             System.out.println("quotient= "+(first/second));
            break;
            default:
            System.out.println("invalid");
        }
    }
}
