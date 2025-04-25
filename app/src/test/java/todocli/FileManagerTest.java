package todocli;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class FileManagerTest {

    private final FileManager fileManager = new FileManager();
    
    @Test void TestSavingToFile(){

        this.fileManager.saveToFile("Hello There");

    }
}
