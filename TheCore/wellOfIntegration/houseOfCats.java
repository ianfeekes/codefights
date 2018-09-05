/*houseOfCats.java
 *created by Ian Feekes January 8th 2017
 *Codefights
 *The Core
 *Well of Integration
 *#69
 */

int[] houseOfCats(int legs) 
{
    ArrayList<Integer> people = new ArrayList<Integer>();
    int p=0;
    while(legs>=0) {
        int c=0;
        if(legs%4==2 ||legs%4==0) {
            if ((legs%4) == 2)
                c = 1;
            else
                c = 0;
        }
        people.add(p+c);
        p+=2;
        legs-=4;
    }
    int[] toReturn = new int[people.size()];
    for(int i=0;i<toReturn.length;i++)
    {
        toReturn[i]=people.get(i);
    }
    return toReturn;
}


