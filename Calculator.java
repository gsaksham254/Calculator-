import java.util.*;
public class Calculator{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       Operator obj = new Operator();
       Calculate obj1 = new Calculate();
       System.out.println("Enter the Choice");
       int choice = sc.nextInt();
       String Opera = obj.operators(choice);
       System.out.println(Opera);
       System.out.println("Enter The Numbers");
       int num1 = sc.nextInt();
       int num2 = sc.nextInt();
       if(Opera == "ADDITION"){
        System.out.println("The Number is " + " " + obj1.ADDITION(num1, num2));
       }
       else if(Opera == "SUBTRACTION"){
        System.out.println("The Number is " + " " + obj1.SUBTRACTION(num1, num2));
       }
       else if(Opera == "MULTIPLICATION"){
        System.out.println("The Number is " + " " + obj1.MULTIPLICATION(num1, num2));
       }
       else if(Opera == "DIVISION"){
        System.out.println("The Number is " + " " + obj1.DIVISION(num1, num2));
       }
       else{
        System.out.println("Invalid Choice");
       }
    }   
}