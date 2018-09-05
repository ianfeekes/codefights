/*depositProfit.java
 *codefights
 *Arcade
 *Introduction
 *Through the Fog
 *#31
 *Created by Ian Feekes December 6th 2017
 */

int depositProfit(int deposit, int rate, int threshold) 
{
    int years = 0;
    double deposite = deposit;
    while(deposite<threshold)
    {
        deposite+=(deposite*rate/100);
        System.out.println(deposite+" ");
        years++;
    }
    return years;
}


