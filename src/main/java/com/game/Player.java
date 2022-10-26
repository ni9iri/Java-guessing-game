package com.game;

// import java.util.Scanner;

public class Player {

    // private Scanner sc = new Scanner(System.in);
    private String name;
    private int totalGamesPlayed;
    private int gamesWon;
    private int guess;
    private int totalMoves;

    // public Scanner getSc() {
    //     return this.sc;
    // }

    // public void setSc(Scanner sc) {
    //     this.sc = sc;
    // }

    public int getTotalMoves() {
        return this.totalMoves;
    }

    public void setTotalMoves(int totalMoves) {
        this.totalMoves = totalMoves;
    }
    // public Player(String name, int gamesPlayed, int gamesWon) {    constructor
    //     this.name = name;
    //     this.gamesPlayed = gamesPlayed;
    //     this.gamesWon = gamesWon;
    // }

    public String getPlayerInfo(){
        return "{\nName: " + name + ", \nGamesPlayed: " + totalGamesPlayed + ",\nTotalMoves: " + totalMoves + "\n}";
    }

    public void setName(String name) {
        // System.out.println("What is your name?");
        // this.name = sc.next();
        this.name = name;

    }

    public String getName() {
        return this.name;
    }

    public void setGuess(int guess) {
        this.guess = guess;

    }

    public int getGuess() {
        return this.guess;

    }


    public int getTotalGamesPlayed() {
        return this.totalGamesPlayed;
    }

    public void setTotalGamesPlayed(int totalGamesPlayed) {
        this.totalGamesPlayed= totalGamesPlayed;
    }

    public int getGamesWon() {
        return this.gamesWon;
    }

    public void setGamesWon(int gamesWon) {
        this.gamesWon = gamesWon;
    }

    
public void incrementTotalmoves(){
    totalMoves++;
}
    

    public void incrementTotalGames(){
        this.totalGamesPlayed += 1;
    }

    public void incrementGamesWon(){
        this.gamesWon += 1;



    }
    

    


}
