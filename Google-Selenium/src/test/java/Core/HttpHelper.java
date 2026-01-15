package Core;

import java.net.HttpURLConnection;
import java.net.URL;

public class HttpHelper {

    public static boolean urlRetorna403(String url) {
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("GET");
            connection.connect();

            int statusCode = connection.getResponseCode();
            return statusCode == 403;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
