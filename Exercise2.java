public class Exercise2 {
	 public static void main(String []args) {
		  int min = 1;
        int max = 10;

    System.out.println("You come across a goblin! You swing your Battle axe!" );
    int random_int = (int)Math.floor(Math.random()*(max-min+1)+min); //https://teamtreehouse.com/community/mathfloor-mathrandom-max-min-1-min-explanation 
    System.out.println(random_int);
    System.out.println("You hit!");
    System.out.println("Your foe is vanquished!");
    System.out.println("You gain 10xp and 2 gold");
    } 
}

