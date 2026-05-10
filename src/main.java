import space.dynomake.libretranslate.Translator;
import space.dynomake.libretranslate.Language;
import java.io.IOException;
import java.util.Scanner; //https://www.tutorialspoint.com/java/java_user_input.html

public class main {
  public static void main(String[] args) throws InterruptedException, IOException {
    Translator.setUrlApi("http://localhost:5000/translate");



    //Thread.sleep(3000);
    //Scanner obj = new Scanner(System.in);
    //System.out.println("\nWhat is your username");
    //String playername = obj.nextLine();

    //TODO, ADD WIN SCREEN WITH POINT TALLY HO, FIX HELLO WORLD SLIPPING THROUGH my fingers all the time


    //String countrycode = httprequest.httpmethod(); // get country code

    //String countryname = country.countrynames(countrycode);

    //String language = languagehhtp.languagehttp(countrycode); // get countries languages

    //String translation = translationary.translationmodule(language.substring(0, language.indexOf(" "))); // gets first word with return from before

    //System.out.println(countrycode + " " + countryname + " " + language);
    //System.out.println(Translator.translate(Language.RUSSIAN, Language.ENGLISH, "Для примера, переведем текст с русского на английский и выведем в консоль:"));

    while (true) {
      System.out.println("Welcome to the Language Guessing Game");
      Thread.sleep(2000);
      System.out.println("This test will present you with the words HELLO WORLD in another language");
      Thread.sleep(2000);
      System.out.println("You have to guess the Language of origin");
      Thread.sleep(2000);
      Scanner obj = new Scanner(System.in);
      System.out.println("\nWhat is your username");
      String playername = obj.nextLine();
      System.out.println("Let the game begin");
      int questionno = 0;
      int correct = 0;
      while (true) {
          String countrycode = httprequest.httpmethod(); // get country code
          //System.out.println(countrycode);
          String countryname = country.countrynames(countrycode);
          //System.out.println(countryname);
          String language = languagehhtp.languagehttp(countrycode).toUpperCase(); // get countries languages
          //System.out.println(language);
          String helloworld;

          if (language == "ENGLISH") {
            continue; // making sure its not easy mode
          }

          try {
              Language chosenlang = Language.valueOf(language);
              System.out.println(chosenlang);
              helloworld = Translator.translate(Language.ENGLISH, chosenlang, "Hello World");
          } catch (Exception e) { //https://www.w3schools.com/java/java_try_catch.asp
              continue;
          }
          if (helloworld == "Hello World") {
            continue; // making sure its not easy mode
          }
          System.out.println("Hello World in the other language: " + helloworld + " " + language); //last bit for testing
          Scanner obj2 = new Scanner(System.in);
          System.out.println("\nWhat is your guess:");
          String Guess = obj2.nextLine();
          System.out.println(Guess);
          if (Guess.toLowerCase().equals(language.toLowerCase())) {
            questionno += 1;
            correct += 1;
            System.out.println("THATS CORRECT, CONGRATULATIONS");
            Thread.sleep(2000);
            System.out.println("Next Question\n\n");
          }
          if (!Guess.toLowerCase().equals(language.toLowerCase())) {
            questionno += 1;
            System.out.println("THATS unfortunately incorrect");
            System.out.println("The answer was " + language);
            Thread.sleep(2000);
            System.out.println("Next Question\n\n");

          if (questionno == 10) {
            System.out.println("\n\n\n\nThe game has finished");
            System.out.println("You finish with a final score of:");
            System.out.println(correct + " Out of 10");
            Scanner obj3 = new Scanner(System.in);
            System.out.println("\nWould you like to play again (y/n)");
            String yesorno = obj3.nextLine();
            if (yesorno == "y") {
              questionno = 0;
              correct = 0;
              break;
            } else if (yesorno == "n") {
                System.exit(0);
            } else {
              System.out.println("Invalid command, time to play again");
            }
          }
          }

      }


    }
  }
}

