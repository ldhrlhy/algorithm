package CommandPattern;

public class Test {
    public static void main(String[] args){
        Chef chef = new Chef();
        Command command = new MakeChickenCommand(chef);
        Waiter waiter = new Waiter();
        waiter.setCommands(command);
        waiter.Notify();
    }

}
