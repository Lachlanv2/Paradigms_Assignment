import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient; // these imports from https://zetcode.com/java/getpostrequest/
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.Random;

public class httprequest { //https://www.w3schools.com/java/java_methods_param.asp
  static String httpmethod() throws IOException, InterruptedException {
    try (HttpClient client = HttpClient.newHttpClient()) {

      HttpRequest request = HttpRequest.newBuilder()
              .uri(URI.create("https://restcountries.com/v3.1/all?fields=cca2")) //https://zetcode.com/java/getpostrequest/
              .build();

      HttpResponse<String> response = client.send(request,
              HttpResponse.BodyHandlers.ofString());


      JSONArray jasoncountry = new JSONArray(response.body()); // who's jason??!?! | parses json into array
      Random randomno = new Random();
      JSONObject randomcounty = jasoncountry.getJSONObject(randomno.nextInt(jasoncountry.length())); // https://www.baeldung.com/java-org-json
      String extractedcountry = randomcounty.getString("cca2");


      //DEBUG PRINTS
      //System.out.println(response.body()); //prints all countries
      // System.out.println(extractedcountry); // prints chosen country
      //System.out.println(randomno);
      return extractedcountry;


    }
  }
}
