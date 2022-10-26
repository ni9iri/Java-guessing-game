package com.game;

import org.springframework.web.bind.annotation.RestController;
import java.util.Random;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class MyController {
    Game game = new Game();
    Player player = new Player();
    // Random rand = new Random();
    // int randomNumber = rand.nextInt(100)+1;

    @GetMapping("/welcome")
    public String welcomeMessage(){
        return game.getWelcomeMessage();
    }

    
    // Create a new player
    @PostMapping("/addPlayer")
    public String createPlayer(@RequestParam String name) {
        player.setName(name);
        player.setTotalMoves(0);

        return "You have created a new player : " + player.getName() + ".\nTo continue the game use HTTP PUT:/game?guess= ";
    }

    // Get player's information
    @GetMapping("/player")
    public String getPlayer() {
        return player.getPlayerInfo();
        
    }

    @PutMapping("/game")
    public String putNumber(@RequestParam Integer guess) {
        // game.start(move);

     boolean hasWon = false;
        // Random rand = new Random();
        // int randomNumber = rand.nextInt(3);
        // player = new Player();
        //  player.setName(null);
        // game.setRandomNum(randomNumber);

         while (!hasWon) {
            player.setGuess(guess);

            if(player.getGuess() > 100 || player.getGuess() < 0) {
                return "Invalid input " + game.getRandomNum();

            } else if (player.getGuess() == game.getRandomNum()) {
                    Random rand = new Random();
                    int randomNumber = rand.nextInt(100)+1;
                    game.setRandomNum(randomNumber);
                
                // hasWon = true;
                player.setTotalGamesPlayed(player.getTotalGamesPlayed() + 1);


                return "Congrats " + player.getName() +" you have won.\n" + "It took you " + player.getTotalMoves() + " attempts.\n\nTo see the results use HTTP GET:/player";
                
            // } else if(hasWon==true) {
            //     return null;

            } else if (player.getGuess() < game.getRandomNum()) {
                player.incrementTotalmoves();
                return "No. The hidden number is higher. Guess again.";

            } else {
                player.incrementTotalmoves();
                return "No. The hidden number is lower. Guess again.";

        }
    
      }
    return "";
    
 

    }

}

    


