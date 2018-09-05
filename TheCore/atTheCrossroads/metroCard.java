/*metroCard.java
 *created by Ian Feekes December 7th 2017
 *Codefights
 *The Core
 *At The Crossroads
 *#16
 */

int[] metroCard(int lastNumberOfDays) 
{
    int[] arr1 = {31};
    int[] arr2= {28,30,31};
    int[] arr3 = {31};
    if(lastNumberOfDays==30)return arr1;
    else if(lastNumberOfDays==31) return arr2;
    else return arr3;
}
