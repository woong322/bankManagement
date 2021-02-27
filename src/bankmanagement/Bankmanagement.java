
package bankmanagement;

import java.util.Scanner;

public class Bankmanagement {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         int balance = 0; //balance initiated
         int menu = 5; //menu initiated
         int i = 0; // variable for Maximum number for password
         
         while(menu != 0){
         System.out.println("=============Bank=============");
         System.out.println("What can I help you with?");
         System.out.println("1. Show Balance");
         System.out.println("2. Do Withdrawal");
         System.out.println("3. Make Deposit");
         System.out.println("4. Quit");
         menu = Integer.parseInt(sc.nextLine());
         
         if(menu == 4){ //quitting program.
              System.out.println("Thank you for using our bank system!");
              java.lang.System.exit(0);
         }
         
         if(menu == 1){ //showing balance
            System.out.println("Password?");
            int password = Integer.parseInt(sc.nextLine());
            if(password == 1234){
                System.out.println("You've selected Show balance!");
                System.out.println("Your balance is " + balance + " $");
                System.out.println("");
            }
            else if(password != 1234){ //if password is wrong it start the loop to count 5 chance for the password
            for(i = 0; i <= 3; i++){
                System.out.println("Wrong Password! Try again!");
                System.out.println("Password?");
                password = Integer.parseInt(sc.nextLine());
                if(password == 1234){
                     System.out.println("You've selected Show balance!");
                     System.out.println("Your balance is " + balance + " $");
                     System.out.println("");
                     break;
                }
                while(password != 1234){
                break;
                    } 
                if(i == 3){ //if the user couldn't find the pass word in five times, the user has to restart the program.
                    System.out.println("You got the wrong password five times, please restart.");
                    java.lang.System.exit(0);
                        }
                    }
                }
            }
         if(menu == 2 ){
            System.out.println("Password?");
            int password = Integer.parseInt(sc.nextLine());
            if(password == 1234){
                System.out.println("You've selected Do withdrawal!");
                System.out.println("How much do you want to withdraw?");
                int withdraw = Integer.parseInt(sc.nextLine());
                while(withdraw > balance){ //withdraw can't be more than balance
                    System.out.println("Withdraw can't be more than Balance!");
                    System.out.println("How much do you want to withdraw?");
                    withdraw = Integer.parseInt(sc.nextLine());
                    }
                if(withdraw <  balance){
                    balance -= withdraw;
                }
                System.out.println("Here is your money " + withdraw +" $." );
                System.out.println("Your balance after withdraw is " + balance +" $.");
                System.out.println("");
                }
            else if(password != 1234){ //same password failure logic as above
            for(i = 0; i <= 3; i++){
                System.out.println("Wrong Password! Try again!");
                System.out.println("Password?");
                password = Integer.parseInt(sc.nextLine());
                if(password == 1234){
                    System.out.println("You've selected Do withdrawal!");
                    System.out.println("How much do you want to withdraw?");
                    int withdraw = Integer.parseInt(sc.nextLine());
                    while(withdraw > balance){
                        System.out.println("Withdraw can't be more than Balance");
                        System.out.println("How much do you want to withdraw?");
                        withdraw = Integer.parseInt(sc.nextLine());
                        }
                    if(withdraw > balance){
                    balance -= withdraw;
                    }
                        System.out.println("Here is your money " + withdraw +" $." );
                        System.out.println("Your balance after withdraw is " + balance +" $.");
                        System.out.println("");
                        break;
                        }
                    }
                while(password != 1234){
                break;
                    } 
                if(i == 3){
                    System.out.println("You got the wrong password five times, please restart.");
                    java.lang.System.exit(0);
                        }
                    }
                }
         if(menu == 3){
            System.out.println("Password?");
            int password = Integer.parseInt(sc.nextLine());
            if(password == 1234){
                System.out.println("You've selected Make deposit!");
                System.out.println("How much do you want to make Deposit?");
                int deposit = Integer.parseInt(sc.nextLine());
                while(deposit < 0){ //deposit can't be negative!
                    System.out.println("Deposit can't be negative!");
                    System.out.println("How much do you want to make Deposit?");
                    deposit = Integer.parseInt(sc.nextLine());
                    }
                if(deposit > 0){
                    balance += deposit;
                }
                System.out.println("Your Deposit " +  deposit + "$ set in your account successfully.");
                System.out.println("Your balance after deposit is " + balance +" $");
                System.out.println("");
            }
            else if(password != 1234){ //same password failure logic as above
            for(i = 0; i <= 3; i++){
                System.out.println("Wrong Password! Try again!");
                System.out.println("Password?");
                password = Integer.parseInt(sc.nextLine());
                if(password == 1234){
                    System.out.println("You've selected Make deposit!");
                    System.out.println("How much do you want to make Deposit?");
                    int deposit = Integer.parseInt(sc.nextLine());
                    while(deposit < 0){
                        System.out.println("Deposit can't be negative!");
                        System.out.println("How much do you want to make Deposit?");
                        deposit = Integer.parseInt(sc.nextLine());
                        }
                    if(deposit > 0){
                    balance += deposit;
                    }
                    System.out.println("Your Deposit " +  deposit + "$ set in your account successfully.");
                    System.out.println("Your balance after deposit is " + balance +" $");
                    System.out.println("");
                    break;
                    }
                    while(password != 1234){
                    break;
                    } 
                        if(i == 3){
                            System.out.println("You got the wrong password five times, please restart.");
                             java.lang.System.exit(0);
                        }
                    }
                }
            }
        }
    }  
}

