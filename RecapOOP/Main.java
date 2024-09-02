package RecapOOP;

import java.util.Scanner;

public class Main {
  public static void main(String[]args) {

    Scanner input = new Scanner(System.in);
    double score = 0;

    for(int i = 1; i <= 5; i++) {
      System.out.println("Enter your score on quiz " + i + ":");
      score += input.nextDouble();
    }
    
    System.out.println("Your score average is: " + score/5);
    if(score/5 < 75) {
      System.out.println("You failed the course!");
    }
    else if(score/5 >= 75 && score/5 <= 100) {
      System.out.println("You passed the course!");
    }
  }
}