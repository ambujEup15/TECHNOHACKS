import java.util.Random;
import java.util.Scanner;

class rockpaperscissor {
    public static void main(String[] args) {
	delay(1000);
	System.out.println("Welcome to Rock/Paper/Scissors Game");
        Random j = new Random();
        int k= j.nextInt(3);
        String[] a={"rock","paper","scissor"};
        String computerchoice=a[k];
        
        Scanner obj = new Scanner(System.in); 
        
	delay(1000);
	
	System.out.println("Enter Rock/Paper/Scissor to start or Enter exit to quit the game. \n ");
        String b = obj.next();
        
	delay(1000);
	
	if(b.equalsIgnoreCase("exit")){
            System.out.println("Quiting the game,Good Bye");}
        
	
	
	else if(b.equalsIgnoreCase(computerchoice)){System.out.println(" Computer choose " + computerchoice + " you choose " + b + " Therefore its a Tie");}
        
	
	
	else if ((b.equalsIgnoreCase("rock")) && (computerchoice.equalsIgnoreCase("Paper"))){
            System.out.println("Computer choose " + computerchoice + " you choose " + b + " You Won! ");
        }
         
	
	else if ((b.equalsIgnoreCase("rock")) && (computerchoice.equalsIgnoreCase("scissor"))){
            System.out.println("Computer choose " + computerchoice + " you choose " + b + " You loose! ");
        }
         
	
	else if ((b.equalsIgnoreCase("paper")) && (computerchoice.equalsIgnoreCase("rock"))){
            System.out.println("Computer choose " + computerchoice + " you choose " + b + " You Won! ");}
	
	 
	
	else if ((b.equalsIgnoreCase("paper")) && (computerchoice.equalsIgnoreCase("scissor"))){
            System.out.println("Computer choose " + computerchoice + " you choose " + b + " You loose! ");}
	
	 
	
	else if ((b.equalsIgnoreCase("scissor")) && (computerchoice.equalsIgnoreCase("Paper"))){
            System.out.println("Computer choose " + computerchoice + " you choose " + b + " You Won! ");}

	
         
	else if ((b.equalsIgnoreCase("scissor")) && (computerchoice.equalsIgnoreCase("rock"))){
            System.out.println("Computer choose " + computerchoice + " you choose " + b + " You loose! ");}
	
	delay(1000);

    System.out.println("Thank You For Playing");}


private static void delay(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
}
}