/*willYou.java
 *created by Ian Feekes December 7th 2017
 *Codefights
 *The Core
 *At The Crossroads
 *#15
 */

boolean willYou(boolean young, boolean beautiful, boolean loved) 
{
    if((young)&&(beautiful))
    {
        if(loved)return false; 
        else return true;
    }
    else if((loved)&&((!young)||(!beautiful)))return true;
            return false; 
}


