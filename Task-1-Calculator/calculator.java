/* TASK 2
Basic Calculator: Create a simple console-based calculator that can perform
basic mathematical operations like addition, subtraction, multiplication,
and division. Allow users to input numbers and choose the operation they
want to perform. */

import java.util.Scanner;

public class calculator{
    Scanner sc  = new Scanner(System.in);
    public static int operation; 
    public static int num1; 
    public static int num2; 

    void getOperation(){
        System.out.println("Enter the Operation :");
        operation = sc.nextInt();
    }
    
    void getInputs(){
        System.out.println("Enter the Number 1 :");
        num1 = sc.nextInt();
        System.out.println("Enter the Number 2 :");
        num2 = sc.nextInt();
    }
    public double addition(int num1, int num2) { 
        return num1+num2;
    }
    public double substraction(int num1, int num2) { 
        return num1-num2;
    }
    public double mutliplication(int num1, int num2) { 
        return num1*num2;
    }
    public double divide(int num1, int num2) { 
        return num1/num2;
    }
    

    public static void main(String[] args) {
        
        System.out.println("Select the opration");
        System.out.println("Press 1 for Addtion");
        System.out.println("Press 2 for Substraction");
        System.out.println("Press 3 for Mutliplication");
        System.out.println("Press 4 for Divide");
        System.out.println("Press 5 for Exit");
        
        calculator calObj = new calculator();
        calObj.getOperation();
        
        switch (operation) {
            case 1:
                calObj.getInputs();
                calObj.addition(num1, num2);
                break;
            case 2:
                calObj.getInputs();
                calObj.substraction(num1, num2);
                break;
            case 3:
                calObj.getInputs();
                calObj.mutliplication(num1, num2);
                break;
            case 4:
                calObj.getInputs();
                calObj.divide(num1, num2);
                break;
            case 5:
                break;
        }
    }
}