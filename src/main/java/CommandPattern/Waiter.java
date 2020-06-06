package CommandPattern;

import java.util.ArrayList;
import java.util.List;

public class Waiter {
    private List<Command> commands = new ArrayList<>();

    public void setCommands(Command command){
        commands.add(command);
    }

    public void removeCommand(Command command){
        commands.remove(command);
    }

    public  void Notify(){
        for(Command command:commands){
            command.executeCommand();
        }
    }
}
