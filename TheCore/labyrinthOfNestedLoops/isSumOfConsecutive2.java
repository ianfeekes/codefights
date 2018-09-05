/*isSumOfConsecutive2.java
 *created by Ian Feekes December 7th 2017
 *Codefights
 *The Core
 *Labyrinth of Nested Loops
 *#44
 */

int isSumOfConsecutive2(int n) 
{
    int numWays = 0;
    int i=1;
    while(i<=n/2)                  //we cannot have consecutive integers that add up to the value if our current int is >=half the value
    {
        int temp = i;             //this is the total value of the consecutive integers being added up 
        if(addNextInteger(i+1, temp, n)) 
        {
            System.out.print("current integer is "+i);
            numWays++;
        }
        i++;
    }
    return numWays;
}

boolean addNextInteger(int x, int currentTotal, int ceiling)
{
    currentTotal+=x;
    if(currentTotal<ceiling) return addNextInteger(x+1, currentTotal, ceiling);
    else if(currentTotal==ceiling)return true; 
    else return false;
}

