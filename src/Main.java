public class Main {

    public static void main(String[] args) {
        Game game = new Game("movies.txt");

        showRules();
        startGame(game);

    }

    private static void startGame(Game startGame) {
        System.out.println("The movie title has " + startGame.getMovieTitle().length() + " characters (including spaces "
                + "and punctuation).");

        while(!startGame.gameEnded()){
            System.out.println("You are guessing: " + startGame.getHiddenMovieTitle());

            System.out.println("\nYou're score is ->");

            System.out.println("("+startGame.getWrongLetters().length()/2 + ") wrong letters: "
                    + startGame.getWrongLetters());
            System.out.println("("+startGame.getRightLetters().length()/2 + ") right letters: "
                    + startGame.getRightLetters());
            startGame.guessLetter();
        }
        if(startGame.WonGame()){
            System.out.println("\nYou win!");
            System.out.println("You have guessed " + startGame.getMovieTitle() + " correctly.");
        }
        else{
            System.out.println("You have guessed (" + startGame.getWrongLetters().length()/2 + ") wrong letters:" +
                    startGame.getWrongLetters());
            System.out.println("\nYou lost!");
            System.out.println("The movie title was " + startGame.getMovieTitle());
            System.out.println("Better luck next time.");
        }
    }

    /**
     * Present the rules of the Game
     */
    private static void showRules() {

        System.out.println("Welcome to Guess the Movie!\n");
        System.out.println("The rules are simple, the computer randomly picks a movie title, and shows you how " +
                "many " + "letters it's made up of.");
        System.out.println("Your goal is to try to figure out the movie by guessing one letter at a time.");
        System.out.println("If a letter is indeed in the title the computer will reveal its correct position in" +
                " the " + "word, if not, you lose a point.");
        System.out.println("If you lose 10 points, game over!");
        System.out.println("Let's start!\n");
    }
}