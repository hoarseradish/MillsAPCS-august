/**
*Gavin Moy
* outputs lyrics to old lady who swallowed a fly song
*revised 8/31/15
*/

public class Old_Lady
{
    public static void main (String[] args) { // each paragraph seperated by an empty line
        fly();
        emptyLine();
        spider();
        emptyLine();
        bird();
        emptyLine();
        cat();
        emptyLine();
        dog();
        emptyLine();
        cow();
        emptyLine();
        horse();
        
}
    public static void oldLady() { // beginning of each paragraph
        System.out.print ("There was an old lady who swallowed a ");
    }
    
    public static void fly() { //fly paragraph
        oldLady();
        System.out.println ("fly,");
        System.out.println ("I don't know why she swallowed the fly,");
        System.out.println("Perhaps she'll die.");
        System.out.println("But it's only a fly");
        System.out.println("I think I'll cry");
        System.out.println ("She guilped it out of the sky");
        System.out.println ("Oh, my!");
    }    
    public static void spider() { //spider paragraph
        oldLady();
        System.out.println ("spider,");
        System.out.println ("That wriggled and jiggled and tickled inside her,");
        sFly();
        System.out.println ("Gone to the by and by \nsigh");
        
    }
    public static void bird() { //bird paragraph
        oldLady();
        System.out.println ("bird,");
        System.out.println ("How absurd! to swallow a bird,");
        bsFly();
        System.out.println ("She'll leave us high and dry.");    
    }
    public static void cat() { //cat paragraph
        oldLady();
        System.out.println ("cat");
        System.out.println ("Imagine that! She swallowed a cat.");
        cbsFly();
        System.out.println ("I hope it's a lie.");    
    }
    public static void dog() { //dog paragraph
        oldLady();
        System.out.println ("dog");
        System.out.println ("She went whole hog to swallow the dog.");
        dcbsFly();
        System.out.println ("There's a tear in my eye.");     
    }
    public static void cow() { //cow paragraph
        oldLady();
        System.out.println ("cow");
        System.out.println("I don't know how she swallowed the cow.");
        cdcbsFly();
        System.out.println ("I'd rather have ham on rye. \nAnd she had a frog on the sly. \nShe did it in one try.");   
    }
    public static void horse() { //horse paragraph
        oldLady();
        System.out.println ("horse");
        System.out.println ("She died, of course.");
        System.out.println ("It was the last course.");
        System.out.println ("I'm filled with remorse.");
        System.out.println ("What's left to say...");
        System.out.println ("Even the artist is crying");
        System.out.println ("We'll miss her dearly");
        System.out.println ("It is such a loss.");
        System.out.println ("She had no time to floss.");
        System.out.println ("She missed out on the sauce.");
        System.out.println (" \nMoral: Never swallow a horse");   
    }
        public static void fWhy () { //repeating fly part
        System.out.println ("I don't know why");
        System.out.println ("She swallowed the fly");
        System.out.println ("Perhaps she'll die");
        
    }
    public static void sFly() { //repeating  part about spider
        System.out.println("She swallowed the spider to catch the fly.");
        fWhy ();
    }
    public static void bsFly() { //repeating part about the bird
        System.out.println ("She swallowed the bird to catch thes spider.");
        sFly();
    }
    public static void cbsFly() { //repeating part about the cat
        System.out.println ("She swallowed the cat to catch the bird. ");
        bsFly();
    }
    public static void dcbsFly() { //repeating part about dog
        System.out.println ("She swallowed the dog to catch the cat.");
        cbsFly();
    }
    public static void cdcbsFly() { //repeaitng part about cow
        System.out.println ("She swallowed the cow to catch the dog.");
        dcbsFly();
    }
    public static void emptyLine() {
        System.out.println ();
    }
}
        
        