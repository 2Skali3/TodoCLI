package todocli;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class Tests {

    private final FileManager fileManager = new FileManager();
    
    @Test void TestSavingToFile(){

        this.fileManager.saveToFile("Hello There");

    }

    @Test void TestPrintTasks(){

        final Task_Impl tasks = new Task_Impl();

        tasks.AddTask("AAA");
        tasks.AddTask("BBB");
        tasks.AddTask("CCC");
        
        tasks.PrintTasks();

    }
}
