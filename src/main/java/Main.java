import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class Main {

    private static int day = 0;
    private static int min = 1;
    private static int max = 2;
    private static int step = 3;

    public static void main(String[] args) throws SQLException {


        Parsing parsing = new Parsing();

       /* List<String> date = parsing.date_int();
        for (; max < date.size(); day += step, min += step, max += step) {
            SQL.creare(date.get(day), date.get(min), date.get(max));


        }
        System.out.println(new Date());

        SQL.get_result("weather");
        */

       SQL.condition();
    }
}