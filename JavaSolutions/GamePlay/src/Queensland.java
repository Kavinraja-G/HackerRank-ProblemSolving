import java.util.Arrays;

public class Queensland extends Themepark{
    private final Boolean[] games = new Boolean[30];
    Queensland(){
        Arrays.fill(games, Boolean.FALSE);
    }
    @Override
    public void gameplay(int g) {
        if(!this.games[g-1])
        {
            System.out.println("Playing game "+g+" at Queensland");
            this.games[g-1] = true;
        }
        else
        {
            System.out.println("You have already played game "+g);
        }
    }
}
