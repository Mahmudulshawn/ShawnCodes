
 
import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Numbers: ");
        System.out.print("a= ");
        float a= sc.nextFloat();
        System.out.print("b= ");
        float b= sc.nextFloat();

        //Consuming the newline Charecter.
        sc.nextLine();

         System.out.println("Operators are +,-,x,/");
        System.out.print("Enter The Operator: ");
        String operator = sc.nextLine();
        
        sc.close();

        float result = 0;

        
       
        switch (operator) {
            case "+":
                result = a+b;  
                System.out.println("The Result is: "+ result);            
                break;

            case "-":
                result = a-b;
                System.out.println("The Result is: "+ result);
                break;
            case "x":
                result = a*b;
                System.out.println("The Result is: "+ result);
                break;
            case "/":
                if (b != 0) {
                    result = a/b;
                    System.out.println("The Result is: "+ result);
                } else{
                    System.out.println("Cannot Divide by 0.");
                   
                }
                break;

            default:
                System.out.println("Enter The Right Oparator.");
                break;
        }
    }
}


