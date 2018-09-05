/*squareDigitsSequence.java
 *created by Ian Feekes December 7th 2017
 *Codefights
 *The Core
 *Labyrinth of Nested Loops
 *#45
 */

int squareDigitsSequence(int a0) 
{
    int temp=squareDigits(a0);
    int incrementer=1; 
    int[] arr = new int[20];
    for(int i=0;i<arr.length;i++)arr[i]=-1;
    arr[0]=a0;
    int index=1;
    while(isNew(temp,arr))
    {
        System.out.println(temp);
        incrementer++;
        arr[index]=temp;
        index++;
        temp=squareDigits(temp);
    }
    return incrementer+1; 
}

boolean isNew(int toCompare, int[] alreadySeen)
{
    int i=0;
    while(alreadySeen[i]!=-1)
    {
        if(toCompare==alreadySeen[i])return false; 
        i++;
    }
    return true; 
}

int squareDigits(int x)
{
    int toReturn = 0;
    while(x>0)
    {
        toReturn+=(x%10)*(x%10);
        x/=10;
    }
    return toReturn; 
}
