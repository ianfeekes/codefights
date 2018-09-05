/*stolenLunch.java
 *created by Ian Feekes January 8th 2017
 *Codefights
 *The Core
 *LabOfTransformations
 *#84
 */

String stolenLunch(String note) 
{
    String str=""; 
    int x;
    char c;
    for(int i=0;i<note.length();i++)
    {
        x = (int)note.charAt(i);
        if((x>96)&&(x<107))
        {
            c=(char)(x-49);
        }
        else if((x>47)&&(x<58))
        {
            c=(char)(x+49);
        }
        else c = note.charAt(i);
        str+=c;
    }
    return str; 
}


