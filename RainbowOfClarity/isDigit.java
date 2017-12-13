/*isDigit.java
 *codefights
 *Arcade
 *Introduction
 *Rainbow of Clarity
 *#48
 *Created by Ian Feekes December 6th 2017
 */

/*I think the purpose of this one is to make sure that the programmer understands ascii and casting (especially between chars and ints). This is good example code for learning that sort of thing - not that its hard (especially if you already know assembly)*/ 

boolean isDigit(char symbol) 
{
    if(((int)symbol<48)||((int)symbol>57)) return false;
    return true; 
}
