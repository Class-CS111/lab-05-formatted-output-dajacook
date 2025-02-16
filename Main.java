// COLLABORATORS: <tutors, instructor, or anyone else who helped you>

// DESCRIPTION: <a sentence about what the purpose of this program is>

public class Main
{
	public static void main(String[] args)
	{
    //DECLARATION + INITIALIZATION SECTION
    double initialAmount = 3.72;
    int numQuarters; 
    int numDimes;
    int numNickels;
    int numPennies;
    int centsRemaining;

    //CALCULATION SECTION
    centsRemaining = (int) (initialAmount*100);
    numQuarters = centsRemaining/25;
    centsRemaining %= 25;
    numDimes = centsRemaining/10;
    centsRemaining %= 10;
    numNickels = centsRemaining/5;
    centsRemaining %= 5;
    numPennies = centsRemaining;

    //OUTPUT SECTION
    //System.out.println(dollarAmount + "is " + numberOfQuarters + "with " + centsRemaining + "cents left over");
    // System.out.println(centsRemaining); // for testing
    // System.out.println(numQuarters);
    // System.out.println(numDimes);
    // System.out.println(numNickels);
    // System.out.println(numPennies);

    System.out.printf("$%.2f can be converted to %d quarters, %d dimes, %d nickels, and %d pennies.", initialAmount, numQuarters, numDimes, numNickels, numPennies);

  }

}
