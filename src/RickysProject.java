import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RickysProject {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        // Get user's name
        System.out.print("Hello, I'm your AI assistant for today. May I please have your name? ");
        String name = scanner.nextLine();
        
        System.out.println("Nice to meet you, " + name + "!");

        // List of possible colors
        String[] colorsArray = new String[] {"blue", "green", "red", "pink", "yellow", "orange", "white", "cyan", "lime", "maroon", "turquoise", "magenta", "aquamarine", "violet", "tan", "amber"};
        List<String> colorsList = new ArrayList<>(Arrays.asList(colorsArray));

        // Ask user's favorite color and validate it
        String colorPick;
        while (true) {
            System.out.print("May I ask what your favorite color is, " + name + "? ");
            colorPick = scanner.nextLine().toLowerCase();
            
            if (colorsList.contains(colorPick)) {
                System.out.println("That's awesome, " + name + "! " + colorPick + " is my favorite color too!");
                break;
            } else {
                System.out.println(colorPick + " is not a valid color. Please try again.");
            }
        }

        // Ask to be best friends
        System.out.print("Can we be best friends? ");
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("sure") || answer.equalsIgnoreCase("ok") || answer.equalsIgnoreCase("yeah") || answer.equalsIgnoreCase("yep")) {
            System.out.println("Yay! Thank you, " + name + "! Best friends forever. Let's go to the Metaverse together!");
        } else {
            System.out.println("Aww man, I really liked you. Well, it was nice to meet you, " + name + ". See you later!");
        }

        scanner.close(); // Close the scanner to avoid memory leaks
    }
}

