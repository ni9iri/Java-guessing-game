package com.game;

// import java.util.Random;
// import java.util.Scanner;


public class Game {

    
    private int randomNum;

    public String getWelcomeMessage() {
        return " Welcome to the guessing game. I have selected a number between 1-100.\nYour goal is to guess it in as few guesses as possible.\nLet's get started:\n\nHTTP GET /welcome - will gives rules of the game\n\nHTTP POST:/addPlayer?name= - will create a new player with given name into the game\n\nHTTP PUT:/game?guess= - will make a guess for the current player. Machine will return whether right or wrong\n\nHTTP GET:/player - displays information about the current player in the game";
    }


    public int getRandomNum() {
        return this.randomNum;
    }

    public void setRandomNum(int randomNum) {
        this.randomNum = randomNum;
        // randomNumber = randomNum;
    }
    
    
    


}
