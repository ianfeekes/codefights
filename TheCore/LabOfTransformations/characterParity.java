/*characterParity
 *created by Ian Feekes January 8th 2017
 *Codefights
 *The Core
 *LabOfTransformations
 *#80
 */

String characterParity(char symbol) 
{
    int i =(int)symbol-48;
    if((i>9)||(i<0))return "not a digit";
    if(i%2==0)return "even";
    return "odd";
}


