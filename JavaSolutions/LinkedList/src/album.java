import java.util.ArrayList;
import java.util.LinkedList;

public class album {
    private String name;
    private String artists;
    private ArrayList<song> Songs;

    public album(String name, String artists) {
        this.name = name;
        this.artists = artists;
        this.Songs = new ArrayList<song>();
    }

    public boolean addSong(String title, double duration)
    {
        if(findSong(title) == null)
        {
            this.Songs.add(new song(title, duration));
            return true;
        }
        return false;
    }

    private song findSong(String title)
    {
        for(song check: this.Songs)
        {
            if(check.getTitle().equals(title))
            {
                return check;
            }
        }
        return null;
    }

    public boolean addToPlaylist(int track, LinkedList<song> playlist)
    {
        int index = track -1;
        if((index>=0) && (index<= this.Songs.size()))
        {
            playlist.add(this.Songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track no:"+track);
        return false;
    }

}
