import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class country {
    public static String countryNames(String countrycode) throws InterruptedException, IOException {
        try (HttpClient client = HttpClient.newHttpClient()) {

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://restcountries.com/v3.1/alpha/" + countrycode)) //https://zetcode.com/java/getpostrequest/
                    .build();

            HttpResponse<String> response = client.send(request,
                    HttpResponse.BodyHandlers.ofString());

            JSONArray jasoncountry = new JSONArray(response.body()); //parse jarva

            JSONObject country = jasoncountry.getJSONObject(0);
            String extractedlanguage = country.getJSONObject("name").getString("common");


            return extractedlanguage;

        }
    }
}
