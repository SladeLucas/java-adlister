
import java.sql.SQLException;

public class DaoFactory {
    private static Ads adsDao;

    public static Ads getAdsDao(){
        if (adsDao == null) {
            try {
                adsDao = new MySQLAdsDao(new Config());
                System.out.println(adsDao);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return adsDao;
    }
}