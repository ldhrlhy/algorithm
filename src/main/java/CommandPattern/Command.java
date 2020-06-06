package CommandPattern;

import javax.sound.midi.Receiver;

public abstract class Command {
    protected Chef chef;
    public Command(Chef chef){
        super();
        this.chef=chef;
    }
    abstract public void executeCommand();

    public Chef getChef(){
        return chef;
    }
    public void setChef(Chef chef){
        this.chef=chef;
    }
}
