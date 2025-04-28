package todocli;

import java.util.Scanner;

public class UserInputs {

    Scanner sc = new Scanner(System.in);

    void askUserAction(){

        final String UserInput = sc.nextLine();

        switch (UserInput) {
            case "hi":
                System.out.println("I had nothing to print for now");

                break;
        
            default:
                System.out.println("something did non work :)");
        }
    }
}
