package ActivityC;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int vowels = 0;
    int consonants = 0;
    int whiteSpaces = 0;

    System.out.println("Character counter\nEnter a string to check the number of vowels, consonants, and white space");
    System.out.println("__________________________________________________________________");
    
    System.out.print("Enter a string: ");
    String userInput = input.nextLine().toLowerCase();

    for(char check : userInput.toCharArray()) {
      if(Character.isWhitespace(check)){
        whiteSpaces++;
      }
      else if(isVowel(check)) {
        vowels++;
      }
      else if(Character.isLetter(check)) {
        consonants++;
      }
    }
    
    System.out.println("Number of vowels: " + vowels);
    System.out.println("Number of constonants: " + consonants);
    System.out.println("Number of white space: " + whiteSpaces);
  }

  private static boolean isVowel(char check) {
    // TODO Auto-generated method stub
    return "aeiou".indexOf(check) != -1;
  }
}