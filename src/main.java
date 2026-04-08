import java.util.Scanner; //https://www.tutorialspoint.com/java/java_user_input.html
public class main {
  public static void main(String[] args) {
    System.out.println("Welcome to the Lanugage Guessing Game");
    System.out.println("This test will present you with the words HELLO WORLD in another language alongside weather info and currency");
    System.out.println("You have to guess the country of origin");
    while(true) { //Main loop
      Scanner obj = new Scanner(System.in);
      System.out.println("What is your username");
      String test = obj.nextLine();
      System.out.println("you put in: " + test);
    }
  }
}