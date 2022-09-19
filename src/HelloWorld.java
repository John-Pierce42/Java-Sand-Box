import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

public class HelloWorld {

    public static void main(String[] args){
//        System.out.println("Hello World!");

//        -------------------- int Variables ---------------
        int myAge = 36;
        myAge = 37;
        int herAge = myAge;
//        System.out.println(herAge);

//        --------------------  Types -------------------------

        byte age = 36;
        long milesToNeptune = 2_600_000_000L;
        Double gasPrices = 5.99;

//        When using "float" you must add a lower or uppercase F to the end of value because the compiler thinks
//        it is a "Double".
        float gasPrice = 10.99F;

//        Use single '' when using single character, and "" when using multiple like strings.
        char firstLetterOfMyName = 'J';
        String myName = "John";

        Boolean myAgeIs36 = true;

//        --------------------- Reference types ---------------------------

        Date now = new Date();
//        System.out.println(now);


//        ----------------------- Strings -----------------------

        String astroName = "Astro Zombie";

//        Storing into a variable
        int num = astroName.length();
//        System.out.println(num);
//                  OR
//        System.out.println(astroName.length());

        System.out.println(astroName.toLowerCase());
        System.out.println(astroName.toUpperCase());
        System.out.println(astroName.indexOf("Z"));
        System.out.println(astroName.indexOf("e"));
//        System.out.println(astroName.charAt(6));
        System.out.println(astroName.substring(6,11));
        System.out.println(astroName.substring(6,12));

//        String[] name = astroName.split(" ");
//
//        System.out.println(name[1] + " " + name[0]);
//        System.out.println(name[1]);

//        OR

//        String[] name = astroName.split("");
//        System.out.println();
//
//        String s = astroName;
//        String result = new StringBuffer(s).reverse().toString();
//        System.out.println(result);

//  ----------------- Arrays ------------------------

        String[] name = new String[1];
        name[0] = astroName;
        System.out.println(Arrays.toString(name));
    }
}
