*// 
* Gavin Moy 
*originally written 8/25/15
*revised 8/29/15
* outputs Missippi using block letters
*/

public class Missisippi
{
    public static void main (String[] args) {
        M();
        System.out.println ();
        I();
        System.out.println ();
        S();
        System.out.println ();
        S();
        System.out.println ();
        I();
        System.out.println ();
        S();
        System.out.println ();
        S();
        System.out.println ();
        I();
        System.out.println ();
        P();
        System.out.println ();
        P();
        System.out.println ();
        I();
    }
        public static void M() {
            TwoM();
            System.out.println ("MM   MM");
            System.out.println ("M M M M");
            System.out.println ("M  M  M");
            TwoM();
            TwoM();
            TwoM();
}
public static void I() {
    Iline();
    OneI();
    OneI();
    OneI();
    OneI();
    OneI();
    Iline();
}
public static void S() {
    Sline();
    Twos();
    System.out.println ("S");
    Sline();
    System.out.println ("      S");
    Twos();
    Sline();
}
public static void P() {
    Pline();
    Twop();
    Twop();
    Pline();
    Onep();
    Onep();
    Onep();
}
public static void TwoM() {
    System.out.println ("M     M");
}
public static void Iline() {
    System.out.println ("IIIII");
}
public static void OneI() {
    System.out.println ("  I  ");
}
public static void Sline() {
    System.out.println (" SSSSS");
}
public static void Twos() {
    System.out.println ("S     S");
}
public static void Pline() {
    System.out.println ("PPPPPP");
}
public static void Twop() {
    System.out.println ("P     P");
}
public static void Onep() {
    System.out.println ("P");
}
public static void newline() {
    System.out.println ();
}
}
