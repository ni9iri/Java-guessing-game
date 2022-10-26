# Java-guessing-game

This game was implemented by using Spring Boot Framework

The game is played by using HTTP method and URLs

## How to play

The Machine thinks of an integer within a know range. You try to guess the number. If the guess is incorrect, then the Machine tells you whether the guess was too high or too low.

## API endpoints

`HTTP GET /welcome` - will gives rules of the game

`HTTP POST:/addPlayer?name=` - will create a new player with given name into the game

`HTTP PUT:/game?guess= ` - will make a guess for the current player. Machine will return whether right or wrong

`HTTP GET:/player ` - displays information about the current player in the game
