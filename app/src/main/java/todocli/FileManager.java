package todocli;

import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

    private final static String fileName = "Tasks.txt";

    protected final void saveToFile(String taskMessage){

        try(FileWriter writer = new FileWriter(this.fileName)){
            writer.write(taskMessage);
        } catch (IOException e){
            System.out.println("Error while trying to write to File " + e.getMessage());
        }
    }

}
