
package com.mycompany.answerthequestion;

import edu.tarleton.logging.Logger;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author 000728303
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many stars are on the USA flag?");
        String userInput = sc.nextLine();
        Logger logg = new Logger("User Answers");
        int userNum = Integer.parseInt(userInput);
        if (userNum == 50){
            System.out.println("Correct!");
        }
        else{
            System.out.println("Incorrect!");
        }
        logg.log("the user input" + userNum);
    }
}
