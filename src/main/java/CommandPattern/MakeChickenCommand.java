package CommandPattern;

public class MakeChickenCommand extends Command{
    public MakeChickenCommand(Chef chef){
        super(chef);
    }

    @Override
    public void executeCommand() {
        super.getChef().makeChicken();
    }
}
