import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient; // these imports from https://zetcode.com/java/getpostrequest/
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class languagehhtp {
  public static String languagehttp(String countrycode) throws InterruptedException, IOException {
    try (HttpClient client = HttpClient.newHttpClient()) {

      HttpRequest request = HttpRequest.newBuilder()
              .uri(URI.create("https://restcountries.com/v3.1/alpha/" + countrycode)) //https://zetcode.com/java/getpostrequest/
              .build();

      HttpResponse<String> response = client.send(request,
              HttpResponse.BodyHandlers.ofString());

      JSONArray jasoncountry = new JSONArray(response.body());
      JSONObject country = jasoncountry.getJSONObject(0);
      JSONObject extractedlanguage = country.getJSONObject("languages");

      String languageCode = extractedlanguage.keys().next(); // https://www.baeldung.com/java-org-json
      String languageName = extractedlanguage.getString(languageCode);
      System.out.println(languageName);
      return languageName;

    }
  }
}


//jasoncountry.getJSONObject("languages").getString()