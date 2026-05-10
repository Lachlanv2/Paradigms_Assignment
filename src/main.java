import space.dynomake.libretranslate.Translator;
import space.dynomake.libretranslate.Language;
import java.io.IOException;
import java.net.http.HttpClient;
import java.util.Scanner; //https://www.tutorialspoint.com/java/java_user_input.html

public class main {
  public static void main(String[] args) throws InterruptedException, IOException {
    Translator.setUrlApi("https://localhost:5000/translate");



    //Thread.sleep(3000);
    //Scanner obj = new Scanner(System.in);
    //System.out.println("\nWhat is your username");
    //String playername = obj.nextLine();

    //TODO, get translation class,


    String countrycode = httprequest.httpmethod(); // get country code

    String countryname = country.countrynames(countrycode);

    String language = languagehhtp.languagehttp(countrycode); // get countries languages

    //String translation = translationary.translationmodule(language.substring(0, language.indexOf(" "))); // gets first word with return from before

    System.out.println(countrycode + " " + countryname + " " + language);


    while (true) {
      System.out.println("Welcome to the Language Guessing Game");
      System.out.println("This test will present you with the words HELLO WORLD in another language alongside weather info and currency");
      System.out.println("You have to guess the country of origin");
      System.out.println(Translator.translate(language.RUSSIAN, Language.ENGLISH, "Для примера, переведем текст с русского на английский и выведем в консоль:"));
    }
  }
}

