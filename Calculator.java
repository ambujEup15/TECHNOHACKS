import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the first no.");
	delay(1000);
        int a = obj.nextInt();
        delay(1000);
	System.out.println("Enter the second no.");
        int b = obj.nextInt();
        int sum = a+b;
        int sub = a-b;
        int mul = a*b;
        float div =(float) a/b;
        delay(1000);
	System.out.println("Enter sum/sub/mul/div to perform any operation");
        delay(1000);
	String d= obj.next();
        if(d.equalsIgnoreCase("sum")){
            System.out.println("The sum of " + a + " and " + b + " is " + sum);}
        else if(d.equalsIgnoreCase("sub"))
         {System.out.println("The Sub of " + a + " and " + b + " is " + sub);}
        else if(d.equalsIgnoreCase("mul"))
         {System.out.println("The multiply of " + a + " and " + b + " is " + mul);}
        else if(d.equalsIgnoreCase("div"))
         {System.out.println("The div of " + a + " and " + b + " is " + div);}
        else{
           System.out.println("Enter the correct operation");}
	
	System.out.println("Thank You For Using !!");
}
       
     private static void delay(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        }
    }
