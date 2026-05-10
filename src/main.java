import java.io.IOException;
import java.net.http.HttpClient;
import java.util.Scanner; //https://www.tutorialspoint.com/java/java_user_input.html

public class main {
  public static void main(String[] args) throws InterruptedException, IOException {
    System.out.println("Welcome to the Language Guessing Game");
    System.out.println("This test will present you with the words HELLO WORLD in another language alongside weather info and currency");
    System.out.println("You have to guess the country of origin");


    //Thread.sleep(3000);
    //Scanner obj = new Scanner(System.in);
    //System.out.println("\nWhat is your username");
    //String playername = obj.nextLine();

    //TODO, get translation class, replace spaces with %20


    String countrycode = httprequest.httpmethod(); // get country code

    String countryname = country.countrynames(countrycode);

    String language = languagehhtp.languagehttp(countrycode); // get countries languages

    String translation = translationary.translationmodule(language.substring(0, language.indexOf(" "))); // gets first word with return from before

    System.out.println(countrycode + " " + countryname + " " + language);
  }
}

