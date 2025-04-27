package todocli;

import java.util.ArrayList;
import java.util.List;

class Task_Impl implements Task{
    
   private final List<String> tasks = new ArrayList<>();
    

    @Override
    public void AddTask(String message) {

        this.tasks.add(message);
    }


    @Override
    public void RemoveTask(int index) {

        this.tasks.remove(index - 1);

    }

    @Override
    public void PrintTasks() {
    
        for(final String task : this.tasks){
            System.out.println(task);
        }
    
    }

    

}
