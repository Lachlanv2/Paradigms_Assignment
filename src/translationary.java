import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class translationary {
    public static String translationmodule(String countrylang) throws InterruptedException, IOException {
        try (HttpClient client = HttpClient.newHttpClient()) {

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://api.mymemory.translated.net/get?q=Hello%20World!&langpair=en%7C" + countrylang)) //https://zetcode.com/java/getpostrequest/
                    .build();

            HttpResponse<String> response = client.send(request,
                    HttpResponse.BodyHandlers.ofString());

            JSONArray jasoncountry = new JSONArray(response.body()); //parse jarva

            JSONObject country = jasoncountry.getJSONObject(0);
            String extractedtranslation = country.getJSONObject("responseData").getString("translatedText");


            return extractedtranslation;

        }
    }
}