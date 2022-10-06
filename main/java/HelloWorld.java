import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HelloWorld {
	
	
public static void main(String[] args) {
	
//	System.out.println("Hello World!");
//	
//	
//	String[] planets = {"Saturn", "Jupiter", "Mars"};
//	
//	System.out.println(planets.length);
//	System.out.println(Arrays.toString(planets));
//	
//	for(String planet : planets) {
//		System.out.println(planet);
//	}
//	
//	for(int i = 0 ; i < planets.length; i++) {
//		
//		System.out.println(Arrays.toString(planets));
//	}
	
	System.out.println("\r");
	System.out.print("Hello, I'm your AI assitant for today. May I please have your name?: \r");
	
	Scanner scanner = new Scanner(System.in);
	String name = scanner.next();
	
	System.out.println("Nice to meet you " + name + "! \r");
	
	System.out.print("May I ask what your favorite color is " + name + "?: \r");
	String colorPick = scanner.next();
	
	
	//	Now try to use a while loop to keep asking user while the input is not a color.
	
	String[] colorsArray = new String[] {"Blue","Green","Red","Pink","Yellow","Orange","White","Cyan","Lime","Maroon","Turquoise","Magenta","Aquamarine","Violet","Tan","Amber"};

	List<String> colorsList = new ArrayList<>(Arrays.asList(colorsArray));
//	System.out.println(colorsList.contains("Green"));
	

	if(colorsList.contains(colorPick)){
		
		System.out.println("Thats awesome " + name + "! " + colorPick + " is my favorite color too! \r");
			} else {
		System.out.println(colorPick + " is not a color silly..\r");
			}
	
	System.out.print("Can we be bestfriends?:\r");
	String answer = scanner.next();
	
	if(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("sure") || answer.equalsIgnoreCase("ok") ||
			answer.equalsIgnoreCase("si") || answer.equalsIgnoreCase("yeah") || answer.equalsIgnoreCase("yep")
//			|| answer.equalsIgnoreCase("you got it")
			){
		
		System.out.print("Yaaay! thank you " + name + "! Best friends forever. let go to the Metaverse together!");
	} else {
		System.out.print("Aww man, I really liked you.. Well, it was nice to meet " + name + ". see you later!");
	}
	
	
	
	
}
}
