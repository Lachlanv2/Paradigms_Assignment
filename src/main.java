import java.util.Scanner; //https://www.tutorialspoint.com/java/java_user_input.html
import java.net.http.HttpRequest;
//import java.util.Thread;
public class main {
  public static void main(String[] args) throws InterruptedException {
    System.out.println("Welcome to the Language Guessing Game");
    System.out.println("This test will present you with the words HELLO WORLD in another language alongside weather info and currency");
    System.out.println("You have to guess the country of origin");
    Thread.sleep(3000);
    Scanner obj = new Scanner(System.in);
    System.out.println("\nWhat is your username");
    String playername = obj.nextLine();




    while(true) { //Main loop
      int questions = 0;
      while(questions != 10);
        System.out.println("Question" + questions);

    }
  }
}