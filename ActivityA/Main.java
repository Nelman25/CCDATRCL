package ActivityA;

import java.util.Scanner;

public class Main {
  public static void main(String[]args) {
    Scanner input = new Scanner(System.in);
    double currentTotalScore = 0;

    System.out.println("Calculate your average \n_______________________________");

    for(int i = 1; i <= 5; i++) {
      System.out.print("Enter your score on quiz " + i + ": ");
      double score = input.nextDouble();

      if(score <= 100 && score >= 1) {
        currentTotalScore += score;
      } else {
        System.out.println("Please enter a valid score.");
        break;
      }
    }
    System.out.println("_______________________________");
    double average = currentTotalScore / 5;

    if(average != 0) {
      System.out.println(average > 60 ? "Your average score is: " + average + "\nYou passed the course." : "Your average score is: " + average + "\nYou failed the course.");
    }

    input.close();
  }
}