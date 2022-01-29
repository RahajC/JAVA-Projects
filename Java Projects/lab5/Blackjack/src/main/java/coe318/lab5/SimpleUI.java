package coe318.lab5;

import java.util.Scanner;

public class SimpleUI implements UserInterface {
    private BlackjackGame game;
    private Scanner user = new Scanner(System.in);

  @Override
    public void setGame(BlackjackGame game) {
        this.game = game;
    }

  @Override
    public void display() {
       
                System.out.println(game.getHouseCards().toString());
       
        System.out.println(game.getYourCards().toString());
                
        
    }

  @Override
    public boolean hitMe() {
        System.out.print("Do you want another card? ");
        String input = null;
        do {
            user.reset();
            System.out.print("Do you want another card? ");
            input = user.nextLine();        
        }while (!input.equalsIgnoreCase("yes") && !input.equalsIgnoreCase("y")
                && !input.equalsIgnoreCase("no") && !input.equalsIgnoreCase("n"));
        
        if (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y"))
            return true;
        else
            return false;
        
    }

  @Override
    public void gameOver() {
        int houseScore = game.score(game.getHouseCards());
        int yourScore = game.score(game.getYourCards());
                
        System.out.println("HOUSE CARDS:");
        System.out.println(game.getHouseCards().toString());
        System.out.println("YOUR CARDS:");
        System.out.println(game.getYourCards().toString());
        
        System.out.println("Your score: " + yourScore + ", " +
                           "House score: " + houseScore );
        
        if(yourScore > 21)
            System.out.println("You lose");
        else if (yourScore == houseScore) 
            System.out.println("You lose");
        else if (yourScore <= 21) {
            if(houseScore > 21 || (yourScore > houseScore))
                System.out.println("You win");
            else
                System.out.println("You lose");
        }
            
    }   

}