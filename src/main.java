import space.dynomake.libretranslate.Translator;
import space.dynomake.libretranslate.Language;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner; //https://www.tutorialspoint.com/java/java_user_input.html

public class main {
  public static void main(String[] args) throws InterruptedException, IOException {
    Translator.setUrlApi("http://localhost:5000/translate");


    while (true) {
      System.out.println("Welcome to the Language Guessing Game");
      Thread.sleep(2000);
      System.out.println("This test will present you with the words HELLO WORLD in another language");
      Thread.sleep(2000);
      System.out.println("You have to guess the Language of origin");
      Thread.sleep(2000);
      Scanner obj = new Scanner(System.in);
      System.out.println("\nWhat is your username:");
      String playername = obj.nextLine();
      System.out.println("Let the game begin");
      int questionno = 9;
      int correct = 0;
      Language previouslang;


      while (true) {
          String countrycode = httprequest.httpmethod(); // get country code
          //System.out.println(countrycode);
          String countryname = country.countryNames(countrycode);
          //System.out.println(countryname);
          String language = languagehhtp.languageHttp(countrycode).toUpperCase(); // get countries languages
          //System.out.println(language);
          String helloworld;

          if (language.equals("ENGLISH")) {
            continue; // making sure its not easy mode
          }

          try {
              Language chosenlang = Language.valueOf(language);
              //System.out.println(chosenlang);
              helloworld = Translator.translate(Language.ENGLISH, chosenlang, "Hello World");
          } catch (Exception e) { //https://www.w3schools.com/java/java_try_catch.asp
              continue;
          }


          if (Objects.equals(helloworld, "Hello World")) {
            continue; // making sure its not easy mode
          }


          System.out.println("You are at Question " + questionno + " Out of 10");
          System.out.println("Hello World in the other language: " + helloworld + " " + language); //last bit for testing
          Scanner obj2 = new Scanner(System.in);
          System.out.println("\nWhat is your guess:");
          String Guess = obj2.nextLine();
          //System.out.println(Guess); DEBUGGING PURPOSES
          if (Guess.toLowerCase().equals(language.toLowerCase())) {
            questionno += 1;
            correct += 1;
            System.out.println("THAT'S CORRECT, CONGRATULATIONS");

            Thread.sleep(2000);
            System.out.println("Next Question\n\n");
          }
          if (!Guess.toLowerCase().equals(language.toLowerCase())) {
            questionno += 1;
            System.out.println("THATS unfortunately incorrect");
            System.out.println("The answer was " + language);
            Thread.sleep(2000);
            System.out.println("Next Question\n\n");

          if (questionno >= 10) {
            System.out.println("\n\n\n\nThe game has finished " + playername);
            System.out.println(playername + " finished with a final score of: " + correct + " Out of 10");
            Scanner obj3 = new Scanner(System.in);
            System.out.println("\nWould you like to play again (y/n)");
            String yesorno = obj3.nextLine();
            if (Objects.equals(yesorno, "y")) {
              questionno = 0;
              correct = 0;
              break;
            } else if (Objects.equals(yesorno, "n")) {
                System.out.println("Thank you for playing");
                System.exit(0);
            } else {
              System.out.println("Invalid command, time to play again");
              break;
            }
          }
          }

      }


    }
  }
}

