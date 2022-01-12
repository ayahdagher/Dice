import java.util.* ;

class Main {
  public static void main(String[] args) 
  {
    Die die = new Die();
    System.out.println(die);
   
  Die d1 = new Die();
  Die d2 = new Die();
  
  //checking for equality
  boolean ans = d1.equals(d2); 
  System.out.println("Are d1 and d2 equal? " + ans); 

// testing out a standard die
 System.out.println(d1);
 System.out.println("Let's roll d1! " + d1.roll()); 
 System.out.println("\nd1 after being rolled:" +  d1);
  
// testing out a 20 sided die  
System.out.println("Let's make a 20 sided die.");
Die d3 = new Die(1, 20); 
System.out.println("New die d3 " +  d3 + "\n Let's roll d3!");
d3.roll(); 
System.out.println("\nd3 after being rolled:" +  d3);
  
// seeing if d1 and d3 are equal 
System.out.println("Are d1 and d3 equal? " + d1.equals(d3));   

// testing out the DiceGames class

System.out.println(" ");
System.out.println(" ");

Scanner scan = new Scanner(System.in);
System.out.println("How many rolls of die would you like?");
int num = scan.nextInt();

DiceGames p = new DiceGames(num); 
p.SnakeEyes(); 

  }
}