public class DiceGames
{
// instance data
private int numRolls ; 
private int[] rolls ; 

// default constructor
public DiceGames()
{
  this(100);
}

//constructor with parameter, x is the number of rolls
public DiceGames(int x)
{
  this.numRolls = x ;
  rolls = new int[numRolls];
  rollDice(); 
}

// private because we don't want to access it outside of the class
private void rollDice()
{
  Die d1 = new Die();
  Die d2 = new Die();

//taking two dice, rolling them, adding the values, and setting it as an element of the array
  for(int i = 0 ; i < rolls.length; i ++)
  {
    rolls[i] = d1.roll() + d2.roll() ; 
  }
}

// iterating through the array to see if there's a sum of 2, and incrementing a counter
public void SnakeEyes()
{

int count = 0 ; 
for(int i: rolls)
{
  if(i == 2)
  {
    count ++ ;
  }
}

System.out.println("You rolled Snake Eyes " + count + " times out of " + numRolls + " rolls! Thanks for playing.");

}







}