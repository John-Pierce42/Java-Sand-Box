import java.util.Date;

public class HelloWorld {

    public static void main(String[] args){
//        System.out.println("Hello World!");

//        -------------------- int Variables ---------------
//        int myAge = 36;
//        myAge = 37;
//        int herAge = myAge;
//        System.out.println(herAge);

//        --------------------  Types -------------------------

        byte myAge = 36;
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
        System.out.println(now);



    }
}
