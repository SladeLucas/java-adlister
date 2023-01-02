import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BeanTest {
    public static void main(String[] args) {
       //initiation
       Album theForeverStory = new Album();
        theForeverStory.setArtist("JID");
        theForeverStory.setId(0);
        theForeverStory.setGenre("Rap");
        theForeverStory.setSales(10000);
        theForeverStory.setRelease_date(2022);
       Album theIncredibleTrueStory = new Album();
        theIncredibleTrueStory.setArtist("Logic");
        theIncredibleTrueStory.setId(1);
        theIncredibleTrueStory.setGenre("Rap");
        theIncredibleTrueStory.setSales(102934);
        theIncredibleTrueStory.setRelease_date(2017);

       List<Album> albums = new ArrayList<Album>();
        albums.add(theForeverStory);
        albums.add(theIncredibleTrueStory);

       for(Album a : albums){
            System.out.println("Name: " + a.getName());
            System.out.println("Artist: " + a.getArtist());
            System.out.println("Genre: " + a.getGenre());
            System.out.println("Release Date: " + a.getRelease_date());
            System.out.println("--------------------");
        }
    }
}
