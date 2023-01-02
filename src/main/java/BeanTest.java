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

       Author charles = new Author();
        charles.setFirstName("Charles");
        charles.setLastName("Dickens");
       Author paulo = new Author();
        paulo.setLastName("Coelho");
        paulo.setFirstName("Paulo");

       Quote idk = new Quote();
        idk.setId(0);
        idk.setAuthor(charles);
        idk.setContent("There is a great white wale out there");
       Quote omen = new Quote();
        omen.setId(1);
        omen.setAuthor(paulo);
        omen.setContent("Look for the signs of life");

       List<Album> albums = new ArrayList<Album>();
        albums.add(theForeverStory);
        albums.add(theIncredibleTrueStory);
       List<Author> authors = new ArrayList<Author>();
        authors.add(charles);
        authors.add(paulo);
       List<Quote> quotes = new ArrayList<Quote>();
        quotes.add(idk);
        quotes.add(omen);


       for(Album a : albums){
            System.out.println("Name: " + a.getName());
            System.out.println("Artist: " + a.getArtist());
            System.out.println("Genre: " + a.getGenre());
            System.out.println("Release Date: " + a.getRelease_date());
            System.out.println("--------------------");
        }

        for(Quote q : quotes){
            System.out.println("Author: " + q.getAuthor().getFirstName() + " " + q.getAuthor().getLastName());
            System.out.println("Quote: " + q.getContent());
        }
    }
}
