import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient; // these imports from https://zetcode.com/java/getpostrequest/
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.stream.Collectors;

public class httprequest { //https://www.w3schools.com/java/java_methods_param.asp
  static void httpmethod() throws IOException, InterruptedException {
    try (HttpClient client = HttpClient.newHttpClient()) {

      HttpRequest request = HttpRequest.newBuilder()
              .uri(URI.create("https://restcountries.com/v3.1/all?fields=name")) //https://zetcode.com/java/getpostrequest/
              .build();

      HttpResponse<String> response = client.send(request,
              HttpResponse.BodyHandlers.ofString());

      //System.out.println(response.body()); prints all countries
      String stringconversion = response.body();
      //stringconversion = stringconversion.replace("{", "");
      //stringconversion = stringconversion.replace("}", "");
      //stringconversion = stringconversion.replace("[", "");
      //stringconversion = stringconversion.replace("]", "");
      stringconversion = stringconversion.replace("\"name\"", "\n\"name\""); //https://exatosoftware.com/how-to-add-quotation-marks-within-a-string-in-java/
      Long countrycount = stringconversion.lines().count(); //count needs Long data type
      int nocontries = countrycount.intValue(); //conversion back to int
      int selectedcountry = (int) (Math.random() * nocontries); //https://javabeginnerstutorial.com/code-base/generate-random-number-java-between-two-numbers/
      String specificLine = stringconversion.lines()
              .skip(selectedcountry - 1)
              .findFirst()
              .orElse("");
      System.out.println(specificLine);
    }
  }
}
