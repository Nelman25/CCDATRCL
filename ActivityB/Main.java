package ActivityB;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("GPA CHECKER\n__________________________________");
    try {
      while(true) {
        System.out.print("Enter your score: ");
        int score = input.nextInt();
        System.out.println(gpaChecker(score));;
      }
    } catch(Exception e) {
      System.out.println("That is not a valid input, please try again.");
    }
  }
  static String gpaChecker(int score) {
    String text = "";
    if(score >= 96 && score <= 100) {
      text = "Your GPA is: 4.0";
    } else if(score >= 90 && score <= 95) {
      text = "Your GPA is: 3.5";
    } else if(score >= 84 && score <= 89) {
      text = "Your GPA is: 3.0";
    } else if(score >= 78 && score <= 83) {
      text = "Your GPA is: 2.5";
    } else if(score >= 72 && score <= 77) {
      text = "Your GPA is: 2.0";
    } else if(score >= 66 && score <= 71) {
      text = "Your GPA is: 1.5";
    } else if(score >= 60 && score <= 65) {
      text = "Your GPA is: 1.0";
    } else if(score < 60) {
      text = "You need to repeat the subject.";
    } else {
      text = "Please enter a valid score.";
    }
    return text;
  }
}