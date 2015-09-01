
/**
 * Outputs the words for the Twelve Days of Christmas
 * blackslashes are shown as \ (the yen sign) on my computer due to its system locale
 * I dont know how it will show on a computer running in the United States locale
 * @author (Gavin Moy)
 * @version (8/27/15)
 * revised 8/31/15
 */
public class Twelve_Days_of_Christmas
{
    public static void main(String[] args) {
        firstDay();
        System.out.println();
        secondDay();
        System.out.println();
        thirdDay();
        System.out.println();
        fourthDay();
        System.out.println();
        fifthDay();
        System.out.println();
        sixthDay();
        System.out.println();
        seventhDay();
        System.out.println();
        eighthDay();
        System.out.println();
        ninthDay();
        System.out.println();
        tenthDay();
        System.out.println();
        eleventhDay();
        System.out.println();
        twelfthDay();
    }

    public static void On() { //used with sent to make "On the _____ day of Christmas" so that i can be filled in
        System.out.print("On the ");
    }

    public static void Sent() {
        System.out.println(" day of Christmas, \nmy true love sent to me");
    }

    public static void firstDay() { //first day 
        On();
        System.out.print("first");
        Sent();
        Part();
    }

    public static void secondDay() { //Second day
        On();
        System.out.print("second");
        Sent();
        Turtle();
    }

    public static void thirdDay() { // third day
        On();
        System.out.print("third");
        Sent();
        French();
    }

    public static void fourthDay() { // fourth day
        On();
        System.out.print("fourth");
        Sent();
        Calling();
    }

    public static void fifthDay() { //fifth day
        On();
        System.out.print("fifth");
        Sent();
        Golden();
    }

    public static void sixthDay() { //sixth day
        On();
        System.out.print("sixth");
        Sent();
        Geese();
    }

    public static void seventhDay() { //seventh day
        On();
        System.out.print("seventh");
        Sent();
        Swans();
    }

    public static void eighthDay() { //eighth day
        On();
        System.out.print("eigth");
        Sent();
        Maids();
    }

    public static void ninthDay() { //ninth day
        On();
        System.out.print("ninth");
        Sent();
        Ladies();
    }

    public static void tenthDay() { //tenth day
        On();
        System.out.print("tenth");
        Sent();
        Lords();
    }

    public static void eleventhDay() { //eleventh day
        On();
        System.out.print("eleventh");
        Sent();
        Pipers();
    }

    public static void twelfthDay() { //twelfth
        On();
        System.out.print("twelfth");
        Sent();
        Drummers();
    }    

    public static void Part() { 
        System.out.println("a partridge in a pear tree.");
    }

    public static void Turtle() { //adds doves and calls for partridge
        System.out.println("two turtle doves, and");
        Part();
    }

    public static void French() { //adds hens and calls for other 2 lines
        System.out.println("three French hens,");
        Turtle();
    }

    public static void Calling() { //4lines  1 new about birds, others from call
        System.out.println("four calling birds,");
        French();
    }

    public static void Golden() { //5lines 1 new about rings, others from call
        System.out.println("five golden rings,");
        Calling();
    }

    public static void Geese() { //6lines 1 new about geese, others from call
        System.out.println("six geese a-laying,");
        Golden();
    }

    public static void Swans() { //7lines 1 new about swans, others from call
        System.out.println("seven swans a-swimming,");
        Geese();
    }

    public static void Maids() { //8lines 1 new and maids, others from call
        System.out.println("eight maids a-milking,");
        Swans();
    }

    public static void Ladies() { //9lines 1 new about ladies, others from call
        System.out.println("nine ladies dancing,");
        Maids();
    }

    public static void Lords() { //10lines 1 new about lords, others from call
        System.out.println("ten lords a-leaping,");
        Ladies();
    }

    public static void Pipers() { //11lines 1 new about pipers, others from call
        System.out.println("eleven pipers piping,");
        Lords();
    }

    public static void Drummers() { //12lines 1 new about drummer, others from call
        System.out.println("Twelve drummers drumming,");
        Pipers();
    }
}

        