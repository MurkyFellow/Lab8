
package com.mycompany.guessthenumber;

import edu.tarleton.logging.Logger;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author 000728303
 */
public class Main {
    public static void main(String[] args) throws IOException {
       
       Random random = new Random();
       Scanner sc = new Scanner(System.in); 
       int num = random.nextInt(10 + 1);
       System.out.println("Guess a number 0 <= x <= 10");
       String userInput = sc.nextLine();
       Logger logg = new Logger("User Answers");
       int userNum = Integer.parseInt(userInput);
       if(userNum < 0 || userNum > 10){
           System.out.println("You have guessed outside the paramaters.");
       }
       else if(userNum == num){
           System.out.println("Correct! Good guess!");
       }
       else if(userNum < num){
           System.out.println("Incorrect, you guessed too low, the correct answer is: " + num);
       }
       else if(userNum > num){
           System.out.println("Incorrect, you guessed too high, the correct answer is: " + num);
       }
      System.out.println("");
      logg.log("User Answered: " + userNum);
    }
}
