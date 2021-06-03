import java.util.Scanner;

class Mars{
    
    public static void main(String[] args ) {
        Scanner input = new Scanner(System.in);
        System.out.println("The game is about to start...");
        System.out.println("Booting up...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("Ready");
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("Hi there, what's your name?");
        String name = input.nextLine();

        System.out.println("Hello, " + name + "! Are you ready for your adventure to Mars?");
        System.out.println("Yesterday, you received a call from your good friend at NASA.");
        System.out.println("They need someone to go to Mars this weekend, and you've been chosen.");
        System.out.println("Are you excited?!");
        String excitement = input.nextLine();
            if (excitement.equals("yes") | excitement.equals("y") | excitement.equals("Y") | excitement.equals("Yes")) {
                System.out.println("I knew you'd say that. It's so cool that you're going to Mars!");
            } else {
                System.out.println("Oh no, too bad you're still going!");
            }
        System.out.println("It's time to pack for your trip to Mars.");
        System.out.println("How many suitcases do you plan to bring?");
        int suitcases = input.nextInt();
        input.nextLine();
            if (suitcases > 2){
                System.out.println("Oh no, that's too many. Try rolling your clothes.");
            } else if (suitcases == 2){
                System.out.println("That's perfect!");
            } else {
                System.out.println("Wow, you pack light!");
            }
        System.out.println("You're allowed to bring one companion animal with you.");
        System.out.println("What kind of companion animal would you like to bring?");
        String animal = input.nextLine();
        
        System.out.println("What is your companion's name?");
        String aName = input.nextLine();
        
        System.out.println("Cool, so you're bringing " + aName + " the " + animal + "!");
        
        System.out.println("NASA has a interior design team offering to outfit your space ship.");
        System.out.println("You have a couple of options for the interior decor of your ship.");
        System.out.println("Your options are:");
        System.out.println(" A  Sleek, modern minimalism");
        System.out.println(" B  Retro/vintage space age");
        System.out.println(" C  SF Hippie chic");
        System.out.println("Which decor would you like? Choose A, B, or C.");
        String style = input.nextLine();
            if (style.equals("A")){
                style = "sleek";
            } else if (style.equals("B")){
                style = "retro";
            } else if (style.equals("C")){
                style = "hippie";
            } else {
                style = "boring";
            }
        System.out.println("I can see it now:");
        System.out.println("Balloonicorn and " + aName + " surfing the celestial abyss ...");
        System.out.println("in a " + style + " spaceship.");
        System.out.println("You crawl into the spaceship with " + animal);
        System.out.println("Brace for take off!");
        System.out.println("5 ...");

        System.out.println("* LIFTOFF *");
    }
}