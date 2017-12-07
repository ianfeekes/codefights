/*knapsackLight.java
 *codefights
 *Arcade
 *Introduction
 *Dark Wilderness
 *#39
 *Created by Ian Feekes December 6th 2017
 */

int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW) 
{
    if(weight1+weight2<=maxW)return value1+value2;
    if(value1>=value2)
    {
        if(weight1<=maxW) return value1;
        else if(weight2<=maxW) return value2;
        else return 0;
    }
    else if(value2>=value1)
    {
        if(weight2<=maxW) return value2;
        else if(weight1<=maxW) return value1;
        else return 0;
    }
    return 0;
}


