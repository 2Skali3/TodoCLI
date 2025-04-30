package todocli;

import java.util.List;

public interface Task {
    
    void AddTask(String message);

    void RemoveTask(int index);

    List<String> getTasks();
}
