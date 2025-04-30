package todocli;

import java.util.Scanner;

public class UserInputs {
    
    final Scanner sc = new Scanner(System.in);
    Task_Impl ti;

    public UserInputs(final Task_Impl ti){
        this.ti = ti;
    }

    public void askUserAction(){

        String UserInput;

        while(true){
            
            System.out.println("What do you want to do? (type help for a list of all commands)");
            System.out.print(">> ");

            UserInput = sc.nextLine();

            switch (UserInput) {
                case "add":
                    System.out.println("what task do you want to add?");
                    this.ti.AddTask(sc.nextLine());
                    break;
            
                case "print":
                    System.out.println(ti.getTasks());
                    break;
                
                case "exit":
                    return;
        
                default:
                    System.out.println("something did non work :)");
            }
        }


    }
}
