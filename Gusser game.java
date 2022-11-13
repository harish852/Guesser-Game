class Guesser
{
int gnum;
int quessNum (int low, int high)
{
System.out.println ("Guesser! Kindly guess the Number between "+low + " to " + high);
Scanner scan = new Scanner (System.in);
gnum = scan.nextInt ( );
if (gnum ›= low && gnum <= high)
{
return gnum;
}
else
{
System.out.println ("Please quess a valid number within the range specified");
return guessNum (low, high);
}
}
}

class Player
{
int pnum;
int predictNum(int low, int high)
{
System.out.println("Player! Kindly predict the Number between "+Low +" to " + high);
Scanner scan = new Scanner (System.in);
pnum = scan.nextInt () ;
if ( (pnum ›= low) && (pnum <= high))
{
return pnum;
}
else
{
System.out.println ("Please predict a valid number within therange specified");
return predictNum (low, high);
}
}
}

class Umpire
{
int numFromGuesser; 
int numFromPlayerl; 
int numFromPlayer2; 
int numFromPlayer3;
void collectNumFromGuesser ()
{
Guesser g= new Guesser();
numFromGuesser = g.guessNum (1, 100) ;
}
void CollectNumFromPlayers()
{
Player p1 = new Player();
Player p2 = new Player();
Player p3 = new Player();
numFromPlayer1 = pl.predictNum (1, 100);
numFromPlayer2 = p2.predictNum (1, 100);
numFromPlayer3 = p3.predictNum (1, 100);
}
}

class GuesserGameApp
{
final static int CHANCES = 3;
public static void main (String[] args)
{
Umpire u = new Umpire();
int i=1;
while (i <= CHANCES)
{
u.collectNumFromGuesser();
u.collectNumFromPlayers();
u.compare();
++i;
}
}
}

void compare()
{
if (numFromGuesser == numFromPlayer1)
{
System.out.println("Playerl Wins It");
}
if (numFromGuesser == numFromPlayer2)
{
System.out.println("Player2 Wins It");
}
if (numFromGuesser == numFromPlayer3)
{
System.out.println ("Player3 Wins It");
}
else if (numFromPlayer1 != numFromGuesser && numFromPlayer2 != numFromGuesser && numFromPlayer3 != numFromGuesser)
{
System.out.println ("Game Lost! Try again");
}










