package todocli;

public interface Task {
    
    void AddTask(String message);

    void RemoveTask(int index);

    void PrintTasks();
}
