
/**
 * Outputs the words for the Twelve Days of Christmas
 * blackslashes are shown as \ (the yen sign) on my computer due to its system locale
 * I dont know how it will show on a computer running in the United States locale
 * @author (Gavin Moy)
 * @version (8/27/15)
 */
public class Twelve_Days_of_Christmas
{
    public static void main(String[] args) {
        FirstDay();
        System.out.println();
        SecondDay();
        System.out.println();
        ThirdDay();
        System.out.println();
        FourthDay();
        System.out.println();
        FifthDay();
        System.out.println();
        SixthDay();
        System.out.println();
        SeventhDay();
        System.out.println();
        EighthDay();
        System.out.println();
        NinthDay();
        System.out.println();
        TenthDay();
        System.out.println();
        EleventhDay();
        System.out.println();
        TwelfthDay();
    }

    public static void On() {
        System.out.print("On the ");
    }

    public static void Sent() {
        System.out.println(" day of Christmas, \nmy true love sent to me");
    }

    public static void FirstDay() {
        On();
        System.out.print("first");
        Sent();
        Part();
    }

    public static void SecondDay() {
        On();
        System.out.print("second");
        Sent();
        Turtle();
    }

    public static void ThirdDay() {
        On();
        System.out.print("third");
        Sent();
        French();
    }

    public static void FourthDay() {
        On();
        System.out.print("fourth");
        Sent();
        Calling();
    }

    public static void FifthDay() {
        On();
        System.out.print("fifth");
        Sent();
        Golden();
    }

    public static void SixthDay() {
        On();
        System.out.print("sixth");
        Sent();
        Geese();
    }

    public static void SeventhDay() {
        On();
        System.out.print("seventh");
        Sent();
        Swans();
    }

    public static void EighthDay() {
        On();
        System.out.print("eigth");
        Sent();
        Maids();
    }

    public static void NinthDay() {
        On();
        System.out.print("ninth");
        Sent();
        Ladies();
    }

    public static void TenthDay() {
        On();
        System.out.print("tenth");
        Sent();
        Lords();
    }

    public static void EleventhDay() {
        On();
        System.out.print("eleventh");
        Sent();
        Pipers();
    }

    public static void TwelfthDay() {
        On();
        System.out.print("twelfth");
        Sent();
        Drummers();
    }    

    public static void Part() {
        System.out.println("a partridge in a pear tree.");
    }

    public static void Turtle() {
        System.out.println("two turtle doves, and");
        Part();
    }

    public static void French() {
        System.out.println("three French hens,");
        Turtle();
    }

    public static void Calling() {
        System.out.println("four calling birds,");
        French();
    }

    public static void Golden() {
        System.out.println("five golden rings,");
        Calling();
    }

    public static void Geese() {
        System.out.println("six geese a-laying,");
        Golden();
    }

    public static void Swans() {
        System.out.println("seven swans a-swimming,");
        Geese();
    }

    public static void Maids() {
        System.out.println("eight maids a-milking,");
        Swans();
    }

    public static void Ladies() {
        System.out.println("nine ladies dancing,");
        Maids();
    }

    public static void Lords() {
        System.out.println("ten lords a-leaping,");
        Ladies();
    }

    public static void Pipers() {
        System.out.println("eleven pipers piping,");
        Lords();
    }

    public static void Drummers() {
        System.out.println("Twelve drummers drumming,");
        Pipers();
    }
}

        