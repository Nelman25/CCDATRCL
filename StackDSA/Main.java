package StackDSA;

import java.util.Stack;

public class Main {
  public static void main(String[] args) {

    //  stack -> LIFO data structure. Last In, First Out
    //           stores object into a sort of "vertical tower"
    //           push() to add from the top 
    //           pop() to remove from the top
    
    Stack<String> games = new Stack<String>();
    
    System.out.println(games.empty()); // checks if games is empty

    games.push("Minecraft");
    games.push("Valorant");
    games.push("Fornite");
    games.push("Call of Duty");
    games.push("Mobile Legends");

    // games.pop(); // removes the last item in the stack (Mobile Legends)
    // System.out.println(games);

    // pop() also returns the object, we can assign that to a variable
    //String myFavGame = games.pop();
    //System.out.println(myFavGame); // outputs Mobile Legends

    //System.out.println(games);
    //System.out.println(games.peek()); // prints the last item in the stack (Mobile Legends)

    // System.out.println(games.search("Mobile Legends")); // if found, it returns (1) the position of the item in the stack, last item being the first(1) and last (5)
    // System.out.println(games.search("Call of Duty")); // returns 2 
    // System.out.println(games.search("Fornite")); // returns 3
    // System.out.println(games.search("Valorant")); // returns 4 
    // System.out.println(games.search("Minecraft")); // returns 5 
    // System.out.println(games.search("Roblox")); // returns -1 because roblox doesn't exist in the stack

    // for(int i=0; i<1000000000; i++) {
    //   games.push("LOL");
    // } OutOfMemoryError, Java heap space

    // USES OF STACKS?
    // 1. undo / redo features in text editors
    // 2. moving back / forward through the browser history
    // 3. backtracking algorithms (maze, file directories)
    // 4. Calling functions (call stack)

  }
}