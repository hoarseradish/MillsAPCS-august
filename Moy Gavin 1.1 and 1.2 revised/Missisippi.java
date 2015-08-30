/**
* Gavin Moy 
*originally written 8/25/15
*revised 8/29/15
* outputs Missippi using block letters
*/

public class Missisippi
{
    public static void main (String[] args) {
        M();
        newline();
        I();
        newline();
        S();
        newline();
        S();
        newline();
        I();
        newline();
        S();
        newline();
        S();
        newline();
        I();
        newline();
        P();
        newline();
        P();
        newline();
        I();
    }
        public static void M() { //Draws the M
            TwoM();
            System.out.println ("MM   MM");
            System.out.println ("M M M M");
            System.out.println ("M  M  M");
            TwoM();
            TwoM();
            TwoM();
}
public static void I() { // Draws the I
    Iline();
    OneI();
    OneI();
    OneI();
    OneI();
    OneI();
    Iline();
}
public static void S() { // Draws the S
    Sline();
    Twos();
    System.out.println ("S");
    Sline();
    System.out.println ("      S");
    Twos();
    Sline();
}
public static void P() { // draws the P
    Pline();
    Twop();
    Twop();
    Pline();
    Onep();
    Onep();
    Onep();
}
public static void TwoM() { // makes the sides of M
    System.out.println ("M     M");
}
public static void Iline() {   // makes a row of I's for top and bottom
    System.out.println ("IIIII");
}
public static void OneI() { // single I for the vertical line
    System.out.println ("  I  ");
}
public static void Sline() { // for the top and bottom of the s
    System.out.println (" SSSSS");
}
public static void Twos() { // middle of S
    System.out.println ("S     S");
}
public static void Pline() { // top and middle of P
    System.out.println ("PPPPPP");
}
public static void Twop() { // to make the hole in P
    System.out.println ("P     P");
}
public static void Onep() { //bottom half of the P
    System.out.println ("P");
}
public static void newline() {
    System.out.println();
}
}