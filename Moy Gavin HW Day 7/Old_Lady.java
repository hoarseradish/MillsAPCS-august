
public class Old_Lady
{
    public static void main (String[] args) {
        Fly();
        System.out.println ();
        Spider();
        System.out.println ();
        Bird();
        System.out.println ();
        Cat();
        System.out.println ();
        Dog();
        System.out.println ();
        Cow();
        System.out.println ();
        Horse();
        
}
    public static void Oldlady() {
        System.out.print ("There was an old lady who swallowed a ");
    }
    
    public static void Fly() {
        Oldlady();
        System.out.println ("fly,");
        System.out.println ("I don't know why she swallowed the fly,");
        System.out.println("Perhaps she'll die.");
        System.out.println("But it's only a fly");
        System.out.println("I think I'll cry");
        System.out.println ("She guilped it out of the sky");
        System.out.println ("Oh, my!");
    }    
    public static void Spider() {
        Oldlady();
        System.out.println ("spider,");
        System.out.println ("That wriggled and jiggled and tickled inside her,");
        Sfly();
        System.out.println ("Gone to the by and by \nsigh");
        
    }
    public static void Bird() {
        Oldlady();
        System.out.println ("bird,");
        System.out.println ("How absurd! to swallow a bird,");
        BSfly();
        System.out.println ("She'll leave us high and dry.");    
    }
    public static void Cat() {
        Oldlady();
        System.out.println ("cat");
        System.out.println ("Imagine that! She swallowed a cat.");
        CBSfly();
        System.out.println ("I hope it's a lie.");    
    }
    public static void Dog() {
        Oldlady();
        System.out.println ("dog");
        System.out.println ("She went whole hog to swallow the dog.");
        DCBSfly();
        System.out.println ("There's a tear in my eye.");     
    }
    public static void Cow() {
        Oldlady();
        System.out.println ("cow");
        System.out.println("I don't know how she swallowed the cow.");
        CDCBSfly();
        System.out.println ("I'd rather have ham on rye. \nAnd she had a frog on the sly. \nShe did it in one try.");   
    }
    public static void Horse() {
        Oldlady();
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
        public static void Fwhy () {
        System.out.println ("I don't know why");
        System.out.println ("She swallowed the fly");
        System.out.println ("Perhaps she'll die");
        
    }
    public static void Sfly() {
        System.out.println("She swallowed the spider to catch the fly.");
        Fwhy ();
    }
    public static void BSfly() {
        System.out.println ("She swallowed the bird to catch thes spider.");
        Sfly();
    }
    public static void CBSfly() {
        System.out.println ("She swallowed the cat to catch the bird. ");
        BSfly();
    }
    public static void DCBSfly() {
        System.out.println ("She swallowed the dog to catch the cat.");
        CBSfly();
    }
    public static void CDCBSfly() {
        System.out.println ("She swallowed the cow to catch the dog.");
        DCBSfly();
    }
}
        
        