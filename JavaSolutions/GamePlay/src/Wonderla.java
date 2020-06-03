import java.util.Arrays;

public class Wonderla extends Themepark{
    private final Boolean[] games = new Boolean[40];
    Wonderla(){
        Arrays.fill(games, Boolean.FALSE);
    }
    @Override
    public void gameplay(int g) {
        if(!this.games[g - 1])
        {
            System.out.println("Playing game "+g+" at Wonderla");
            this.games[g-1] = true;
        }
        else
        {
            System.out.println("Playing game again "+g+" at Wonderla");
        }
    }
}
