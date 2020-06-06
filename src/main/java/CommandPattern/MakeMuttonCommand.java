package CommandPattern;

public class MakeMuttonCommand extends Command{
    public MakeMuttonCommand(Chef chef){
        super(chef);
    }

    @Override
    public void executeCommand() {
        super.getChef().makeMutton();
    }
}
