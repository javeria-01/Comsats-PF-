package projectt;
import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
public class Hangman {
    static String[] countries = {
                "Afghanistan",
                "Albania",
                "Algeria",
                "Andorra",
                "Angola",
                "Antigua",
                "Argentina",
                "Armenia",
                "Australia",
                "Austria",
                "Azerbaijan",
                "Bahamas",
                "Bahrain",
                "Bangladesh",
                "Barbados",
                "Belarus",
                "Belgium",
                "Belize",
                "Benin",
                "Bhutan"
        };
     static String[] sports = {
                "Archery",
                "Athletics",
                "Badminton",
                "Baseball",
                "Basketball",
                "Boxing",
                "Canoeing",
                "Cricket",
                "Cycling",
                "Diving",
                "Equestrian",
                "Fencing",
                "Fieldhockey",
                "Football",
                "Golf",
                "Gymnastics",
                "Handball",
                "Icehockey",
                "Judo",
                "Lacrosse"
        };
     static String[] foods = {
                "Apples",
                "Bagels",
                "Carrots",
                "Donuts",
                "Egg",
                "Falafel",
                "Grapes",
                "Burgers",
                "Icecream",
                "Jambalaya",
                "Kale",
                "Lemons",
                "Mangoes",
                "Nachos",
                "Oatmeal",
                "Pancakes",
                "Quiche",
                "Rice",
                "Spaghetti",
                "Tacos"
        };
        static Scanner sc = new Scanner(System.in);
        static int No_of_Tries = 7;
        static StringBuffer buf = new StringBuffer();

        public static void main(String[] args) {
            System.out.println("\t\t\t\t\t Hangman ");
            String playAgain = "yes";
            while (playAgain.equals("yes")) {
                playGame();
                System.out.print("Want to Play Again [yes / no]: ");
                playAgain = sc.next().toLowerCase();
            }
            System.out.println("Thanks For Playing Have A Nice Day! ");
        }
        // Method to Initiate Play Game
        private static void playGame() {
            System.out.println("What you want to Guess ");
            System.out.println("1. Countries Name");
            System.out.println("2. Sports Name");
            System.out.println("3. Food Name");
            System.out.print("Enter Your Choice: ");
            int choice = sc.nextInt();
            boolean youWon = false;
            // Generating Random Word that would be guessed by the Player in Limited Tries would be 7
            String toGuess = getRandomName(choice).toLowerCase();
            // upper method invoke return invalid It will again take choice
            if (toGuess.equals("invalid")) {
                System.out.println("Invalid choice Re-Enter Choice: ");
                choice = sc.nextInt();
                youWon = false;
                toGuess = getRandomName(choice).toLowerCase();
            }
            // converting the generated word to Array in the method and only reveal the vowels to Player
            char[] wordArray = getVowels(toGuess);
            System.out.println(Arrays.toString(wordArray));
            // starting the game
            do {
                // if the character Array equal the generated word end the game congrats the player
                if (toString(wordArray).equals(toGuess)) {
                    System.out.println("You guessed ");
                    System.out.println("The Word was " + toGuess);
                    youWon = true;
                    break;
                }
                // Guessing charcter of words one by one
                System.out.println("Guess The Remaining Character one by one: ");
                char guess = sc.next().charAt(0);
                // if the entered characters is not already used
                if (!buf.toString().contains("" + guess)) {
                    // this method invoke chk if the characters exist in the generated word if not decrement no_of_tries
                    if (!checkCharacter(wordArray, toGuess, guess)) {
                        No_of_Tries--;
                    }
                }
                // if used return to top of the loop
                else {
                    System.out.println("Invalid Input Reenter");
                    continue;
                }
                // Display how much word is guessed , No of tries and letter player has used
                System.out.println(Arrays.toString(wordArray));
                System.out.println("Tries Left: " + No_of_Tries);
                System.out.println("Used Letters -> " + buf.toString());
            } while (No_of_Tries > 0);
            // youWon == false display you lose and dispaly the word you were unable to guess
            if (!youWon) {
                System.out.println("You Lose! Try Again ");
                System.out.println("The Word Was " + toGuess);
            }
        }
        public static String getRandomName(int choice) {
            buf.append(" ").append('a').append(" ").append('e').append(" ").append('i').append(" ").append('o').append(" ").append('u');
            Random random = new Random();
            int rand;
            if (choice == 1) {
                rand = random.nextInt(countries.length);
                return countries[rand];
            } else if (choice == 2) {
                rand = random.nextInt(sports.length);
                return sports[rand];
            } else if (choice == 3) {
                rand = random.nextInt(foods.length);
                return foods[rand];
            } else {
                System.out.println("Invalid Choice");
            }
            return "invalid";
        }
        public static char[] getVowels(String word) {
            char[] vowels = new char[word.length()];
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                    vowels[i] = word.charAt(i);
                } else {
                    vowels[i] = '_';
                }
            }
            return vowels;
        }
        public static boolean checkCharacter(char[] arr, String toGuess, char guess) {
            boolean youGuessed = false;
            buf.append(" ").append(guess);
            for (int i = 0; i < arr.length; i++) {
                if (toGuess.charAt(i) == guess) {
                    arr[i] = guess;
                    youGuessed = true;
                }
            }
            return youGuessed;
        }
        public static String toString(char[] a) {
            String string = new String(a);
            return string;
        }
    }
