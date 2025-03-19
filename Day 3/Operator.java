import java.util.*;
public class Operator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operation to be performed");
        char get = sc.next().charAt(0);
       System.out.println("Enter 2 values ");
        int a = sc.nextInt();
        int b = sc.nextInt(); 
        switch (get) {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                 System.out.println(a-b);
                break;
                case '/':
                System.out.println(a/b);
                break;
            case '%':
                 System.out.println(a%b);
                break;
        
            default:
               System.out.println("Invalid");
                break;
        }
        
        }
}
